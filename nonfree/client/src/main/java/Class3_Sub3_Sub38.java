import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wl")
public final class Class3_Sub3_Sub38 extends Class3_Sub3 {

	@OriginalMember(owner = "client!wl", name = "P", descriptor = "I")
	private int anInt6801;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "()V")
	public Class3_Sub3_Sub38() {
		this(4096);
	}

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(I)V")
	public Class3_Sub3_Sub38(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt6801 = 4096;
		this.anInt6801 = arg0;
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lclient!fb;ZI)V")
	@Override
	public void method5731(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6801 = (arg0.method3643() << 12) / 255;
		}
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5727(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass217_41.method5701(arg0);
		if (super.aClass217_41.aBoolean451) {
			Static367.method4031(local14, 0, Static131.anInt2755, this.anInt6801);
		}
		return local14;
	}
}
