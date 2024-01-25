import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public final class Class44_Sub1_Sub1 extends Class44_Sub1 {

	@OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
	public final int anInt848;

	@OriginalMember(owner = "client!bo", name = "P", descriptor = "I")
	public final int anInt850;

	@OriginalMember(owner = "client!bo", name = "H", descriptor = "Z")
	public final boolean aBoolean56;

	@OriginalMember(owner = "client!bo", name = "O", descriptor = "F")
	public final float aFloat11;

	@OriginalMember(owner = "client!bo", name = "S", descriptor = "F")
	public final float aFloat12;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!kv;IIIIIIZ)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt848 = arg4;
		this.anInt850 = arg3;
		this.aBoolean56 = false;
		this.aFloat11 = (float) arg3 / (float) arg5;
		this.aFloat12 = (float) arg4 / (float) arg6;
		this.method794(false, false);
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!kv;IIIZ[III)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt848 = arg3;
		if (super.anInt7892 == 34037) {
			this.aFloat12 = (float) arg3;
			this.aFloat11 = (float) arg2;
			this.aBoolean56 = false;
		} else {
			this.aBoolean56 = true;
			this.aFloat11 = this.aFloat12 = 1.0F;
		}
		this.anInt850 = arg2;
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!kv;IIIIZ[BI)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt850 = arg3;
		if (super.anInt7892 == 34037) {
			this.aBoolean56 = false;
			this.aFloat12 = (float) arg4;
			this.aFloat11 = (float) arg3;
		} else {
			this.aFloat11 = this.aFloat12 = 1.0F;
			this.aBoolean56 = true;
		}
		this.anInt848 = arg4;
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!kv;IIII[I)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt848 = arg2;
		this.anInt850 = arg1;
		this.method796(0, arg1, arg5, 0, arg2, 0);
		this.aFloat12 = (float) arg2 / (float) arg4;
		this.aBoolean56 = false;
		this.aFloat11 = (float) arg1 / (float) arg3;
		this.method794(false, false);
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!kv;IIIII[BI)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt848 = arg3;
		this.anInt850 = arg2;
		this.method798(arg7, arg2, arg6, arg3, true);
		this.aFloat11 = (float) arg2 / (float) arg4;
		this.aBoolean56 = false;
		this.aFloat12 = (float) arg3 / (float) arg5;
		this.method794(false, false);
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!kv;IIIII)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.aFloat12 = (float) arg3 / (float) arg5;
		this.anInt848 = arg3;
		this.aBoolean56 = false;
		this.anInt850 = arg2;
		this.aFloat11 = (float) arg2 / (float) arg4;
		this.method794(false, false);
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!kv;IIIIIZ)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt850 = arg4;
		this.anInt848 = arg5;
		if (super.anInt7892 == 34037) {
			this.aBoolean56 = false;
			this.aFloat11 = (float) arg4;
			this.aFloat12 = (float) arg5;
		} else {
			this.aBoolean56 = true;
			this.aFloat11 = this.aFloat12 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!kv;IIII)V")
	public Class44_Sub1_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		if (super.anInt7892 == 34037) {
			this.aFloat11 = (float) arg3;
			this.aFloat12 = (float) arg4;
			this.aBoolean56 = false;
		} else {
			this.aFloat11 = this.aFloat12 = 1.0F;
			this.aBoolean56 = true;
		}
		this.anInt850 = arg3;
		this.anInt848 = arg4;
	}
}
