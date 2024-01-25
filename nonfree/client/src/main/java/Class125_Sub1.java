import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public final class Class125_Sub1 extends Class125 {

	@OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
	private final int anInt3225;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!wd;I)V")
	public Class125_Sub1(@OriginalArg(0) Class215 arg0, @OriginalArg(1) int arg1) {
		Static156.anInterface1_1 = arg0.method5662();
		this.anInt3225 = arg1;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()I")
	@Override
	protected int method5302() {
		return Static156.anInterface1_1.method753(this.anInt3225);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method5304(@OriginalArg(0) Component arg0) throws Exception {
		Static156.anInterface1_1.method756(arg0, Static348.anInt6162, Static340.aBoolean542);
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V")
	@Override
	public void method5312(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static156.anInterface1_1.method755(arg0, this.anInt3225);
	}

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "()V")
	@Override
	protected void method5313() {
		Static156.anInterface1_1.method758(this.anInt3225);
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "()V")
	@Override
	protected void method5315() {
		Static156.anInterface1_1.method754(this.anInt3225);
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "()V")
	@Override
	protected void method5308() {
		Static156.anInterface1_1.method757(this.anInt3225, super.anIntArray588);
	}
}
