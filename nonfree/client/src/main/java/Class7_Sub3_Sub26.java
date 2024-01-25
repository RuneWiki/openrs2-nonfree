import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class7_Sub3_Sub26 extends Class7_Sub3 {

	@OriginalMember(owner = "client!qq", name = "J", descriptor = "I")
	private int anInt5443;

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "()V")
	public Class7_Sub3_Sub26() {
		this(4096);
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(I)V")
	public Class7_Sub3_Sub26(@OriginalArg(0) int arg0) {
		super(0, true);
		this.anInt5443 = 4096;
		this.anInt5443 = arg0;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5594(@OriginalArg(0) int arg0) {
		@Pc(14) int[] local14 = super.aClass113_41.method2456(arg0);
		if (super.aClass113_41.aBoolean181) {
			Static464.method3634(local14, 0, Static58.anInt1052, this.anInt5443);
		}
		return local14;
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZLclient!gk;)V")
	@Override
	public void method5599(@OriginalArg(0) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt5443 = (arg1.method3981() << 12) / 255;
		}
	}
}
