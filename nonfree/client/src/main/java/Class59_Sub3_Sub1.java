import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public final class Class59_Sub3_Sub1 extends Class59_Sub3 {

	@OriginalMember(owner = "client!wq", name = "L", descriptor = "I")
	public final int anInt7494;

	@OriginalMember(owner = "client!wq", name = "H", descriptor = "I")
	public final int anInt7491;

	@OriginalMember(owner = "client!wq", name = "K", descriptor = "Z")
	public final boolean aBoolean508;

	@OriginalMember(owner = "client!wq", name = "G", descriptor = "F")
	public final float aFloat220;

	@OriginalMember(owner = "client!wq", name = "S", descriptor = "F")
	public final float aFloat221;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!vd;IIIZ[I)V")
	public Class59_Sub3_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt7494 = arg3;
		this.anInt7491 = arg2;
		if (super.anInt7465 == 34037) {
			this.aBoolean508 = false;
			this.aFloat220 = arg2;
			this.aFloat221 = arg3;
		} else {
			this.aFloat220 = this.aFloat221 = 1.0F;
			this.aBoolean508 = true;
		}
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!vd;IIIIIZ)V")
	public Class59_Sub3_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt7494 = arg5;
		if (super.anInt7465 == 34037) {
			this.aBoolean508 = false;
			this.aFloat221 = arg5;
			this.aFloat220 = arg4;
		} else {
			this.aFloat220 = this.aFloat221 = 1.0F;
			this.aBoolean508 = true;
		}
		this.anInt7491 = arg4;
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!vd;IIIII[BI)V")
	public Class59_Sub3_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt7494 = arg3;
		this.anInt7491 = arg2;
		this.method5765(arg7, arg6, arg2, true, arg3);
		this.aFloat221 = (float) arg3 / (float) arg5;
		this.aFloat220 = (float) arg2 / (float) arg4;
		this.aBoolean508 = false;
		this.method5770(false, false);
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!vd;IIIIIIZ)V")
	public Class59_Sub3_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat221 = (float) arg4 / (float) arg6;
		this.aBoolean508 = false;
		this.aFloat220 = (float) arg3 / (float) arg5;
		this.anInt7494 = arg4;
		this.anInt7491 = arg3;
		this.method5770(false, false);
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!vd;IIII[I)V")
	public Class59_Sub3_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt7491 = arg1;
		this.anInt7494 = arg2;
		this.method5764(arg2, arg5, arg1);
		this.aFloat221 = (float) arg2 / (float) arg4;
		this.aFloat220 = (float) arg1 / (float) arg3;
		this.aBoolean508 = false;
		this.method5770(false, false);
	}

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!vd;IIIIZ[BI)V")
	public Class59_Sub3_Sub1(@OriginalArg(0) Class51_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt7465 == 34037) {
			this.aBoolean508 = false;
			this.aFloat221 = arg4;
			this.aFloat220 = arg3;
		} else {
			this.aFloat220 = this.aFloat221 = 1.0F;
			this.aBoolean508 = true;
		}
		this.anInt7491 = arg3;
		this.anInt7494 = arg4;
	}
}
