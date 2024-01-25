import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class29_Sub5 extends Class29 {

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	private final int anInt3192;

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	private final int anInt3191;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
	private final int anInt3193;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub5(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt3192 = arg0.method2028(-14795);
		this.anInt3191 = arg0.method2028(-14795);
		this.anInt3193 = arg0.method2048(255);
	}

	@OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		@Pc(8) Class7 local8 = Static470.aClass7Array1[this.anInt3192];
		@Pc(21) Class371 local21 = Static393.aClass371Array1[this.anInt3191];
		local21.method8531(local8, this.anInt3193);
	}
}
