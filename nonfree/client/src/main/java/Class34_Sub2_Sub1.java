import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public final class Class34_Sub2_Sub1 extends Class34_Sub2 {

	@OriginalMember(owner = "client!dea", name = "O", descriptor = "F")
	public final float aFloat36;

	@OriginalMember(owner = "client!dea", name = "J", descriptor = "Z")
	public final boolean aBoolean185;

	@OriginalMember(owner = "client!dea", name = "N", descriptor = "I")
	public final int anInt2193;

	@OriginalMember(owner = "client!dea", name = "I", descriptor = "F")
	public final float aFloat35;

	@OriginalMember(owner = "client!dea", name = "G", descriptor = "I")
	public final int anInt2189;

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!us;IIIII)V")
	public Class34_Sub2_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat36 = (float) arg2 / (float) arg4;
		this.aBoolean185 = false;
		this.anInt2193 = arg2;
		this.aFloat35 = (float) arg3 / (float) arg5;
		this.anInt2189 = arg3;
		this.method1964(false, false);
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!us;IIIIIIZ)V")
	public Class34_Sub2_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat35 = (float) arg4 / (float) arg6;
		this.anInt2193 = arg3;
		this.aFloat36 = (float) arg3 / (float) arg5;
		this.anInt2189 = arg4;
		this.aBoolean185 = false;
		this.method1964(false, false);
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!us;IIIIIZ)V")
	public Class34_Sub2_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt2193 = arg4;
		this.anInt2189 = arg5;
		if (super.anInt5770 == 34037) {
			this.aBoolean185 = false;
			this.aFloat35 = arg5;
			this.aFloat36 = arg4;
		} else {
			this.aFloat36 = this.aFloat35 = 1.0F;
			this.aBoolean185 = true;
		}
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!us;IIIII[BI)V")
	public Class34_Sub2_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt2189 = arg3;
		this.anInt2193 = arg2;
		this.method1963(arg7, arg3, arg2, true, arg6);
		this.aFloat36 = (float) arg2 / (float) arg4;
		this.aFloat35 = (float) arg3 / (float) arg5;
		this.aBoolean185 = false;
		this.method1964(false, false);
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!us;IIII)V")
	public Class34_Sub2_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2193 = arg3;
		this.anInt2189 = arg4;
		if (super.anInt5770 == 34037) {
			this.aBoolean185 = false;
			this.aFloat35 = arg4;
			this.aFloat36 = arg3;
		} else {
			this.aFloat36 = this.aFloat35 = 1.0F;
			this.aBoolean185 = true;
		}
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!us;IIIZ[I)V")
	public Class34_Sub2_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt2193 = arg2;
		this.anInt2189 = arg3;
		if (super.anInt5770 == 34037) {
			this.aFloat36 = arg2;
			this.aBoolean185 = false;
			this.aFloat35 = arg3;
		} else {
			this.aFloat36 = this.aFloat35 = 1.0F;
			this.aBoolean185 = true;
		}
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!us;IIIIZ[BI)V")
	public Class34_Sub2_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt2193 = arg3;
		if (super.anInt5770 == 34037) {
			this.aFloat36 = arg3;
			this.aBoolean185 = false;
			this.aFloat35 = arg4;
		} else {
			this.aFloat36 = this.aFloat35 = 1.0F;
			this.aBoolean185 = true;
		}
		this.anInt2189 = arg4;
	}

	@OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lclient!us;IIII[I)V")
	public Class34_Sub2_Sub1(@OriginalArg(0) Class43_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt2193 = arg1;
		this.anInt2189 = arg2;
		this.method1961(arg5, arg1, arg2);
		this.aBoolean185 = false;
		this.aFloat36 = (float) arg1 / (float) arg3;
		this.aFloat35 = (float) arg2 / (float) arg4;
		this.method1964(false, false);
	}
}
