import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public final class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
	private final int anInt965;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!nv;I)V")
	public Class31_Sub1(@OriginalArg(0) Class183 arg0, @OriginalArg(1) int arg1) {
		Static33.anInterface12_1 = arg0.method4155();
		this.anInt965 = arg1;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	@Override
	public void method2007(@OriginalArg(0) Component arg0) throws Exception {
		Static33.anInterface12_1.method5659(Static344.aBoolean402, arg0, Static84.anInt2035);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	@Override
	public void method2002(@OriginalArg(0) int arg0) throws Exception {
		if (arg0 > 32768) {
			throw new IllegalArgumentException();
		}
		Static33.anInterface12_1.method5661(arg0, this.anInt965);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "()I")
	@Override
	protected int method2003() {
		return Static33.anInterface12_1.method5658(this.anInt965);
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "()V")
	@Override
	protected void method2015() {
		Static33.anInterface12_1.method5660(this.anInt965);
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "()V")
	@Override
	protected void method2008() {
		Static33.anInterface12_1.method5656(this.anInt965, super.anIntArray287);
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "()V")
	@Override
	protected void method2020() {
		Static33.anInterface12_1.method5657(this.anInt965);
	}
}
