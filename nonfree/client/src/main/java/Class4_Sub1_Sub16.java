import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rt")
public final class Class4_Sub1_Sub16 extends Class4_Sub1 {

	@OriginalMember(owner = "client!rt", name = "D", descriptor = "I")
	public int anInt6319 = -1;

	@OriginalMember(owner = "client!rt", name = "z", descriptor = "I")
	public int anInt6315 = 0;

	@OriginalMember(owner = "client!rt", name = "M", descriptor = "Z")
	public boolean aBoolean432 = true;

	@OriginalMember(owner = "client!rt", name = "A", descriptor = "I")
	public int anInt6316 = -1;

	@OriginalMember(owner = "client!rt", name = "B", descriptor = "I")
	public int anInt6317 = 0;

	@OriginalMember(owner = "client!rt", name = "Q", descriptor = "I")
	public int anInt6327 = 12800;

	@OriginalMember(owner = "client!rt", name = "T", descriptor = "I")
	public int anInt6329 = 12800;

	@OriginalMember(owner = "client!rt", name = "N", descriptor = "Ljava/lang/String;")
	public final String aString58;

	@OriginalMember(owner = "client!rt", name = "P", descriptor = "I")
	public final int anInt6326;

	@OriginalMember(owner = "client!rt", name = "S", descriptor = "I")
	public final int anInt6328;

	@OriginalMember(owner = "client!rt", name = "F", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!rt", name = "R", descriptor = "Lclient!vr;")
	public final Class258 aClass258_43;

	static {
		new Class242("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
		new Class242("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class4_Sub1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6316 = arg6;
		this.aBoolean432 = arg5;
		this.aString58 = arg1;
		this.anInt6326 = arg0;
		this.anInt6328 = arg3;
		this.aString57 = arg2;
		this.anInt6319 = arg4;
		if (this.anInt6316 == 255) {
			this.anInt6316 = 0;
		}
		this.aClass258_43 = new Class258();
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III)Z")
	public boolean method4917(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class4_Sub38 local11 = (Class4_Sub38) this.aClass258_43.method5538(); local11 != null; local11 = (Class4_Sub38) this.aClass258_43.method5528()) {
			if (local11.method4996(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)V")
	public void method4920() {
		this.anInt6315 = 0;
		this.anInt6327 = 12800;
		this.anInt6317 = 0;
		this.anInt6329 = 12800;
		for (@Pc(23) Class4_Sub38 local23 = (Class4_Sub38) this.aClass258_43.method5538(); local23 != null; local23 = (Class4_Sub38) this.aClass258_43.method5528()) {
			if (local23.anInt6409 > this.anInt6317) {
				this.anInt6317 = local23.anInt6409;
			}
			if (local23.anInt6410 < this.anInt6329) {
				this.anInt6329 = local23.anInt6410;
			}
			if (local23.anInt6419 > this.anInt6315) {
				this.anInt6315 = local23.anInt6419;
			}
			if (this.anInt6327 > local23.anInt6408) {
				this.anInt6327 = local23.anInt6408;
			}
		}
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(III[I)Z")
	public boolean method4921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(22) Class4_Sub38 local22 = (Class4_Sub38) this.aClass258_43.method5538(); local22 != null; local22 = (Class4_Sub38) this.aClass258_43.method5528()) {
			if (local22.method4996(arg1, arg0)) {
				local22.method4993(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(II[IB)Z")
	public boolean method4922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(16) Class4_Sub38 local16 = (Class4_Sub38) this.aClass258_43.method5538(); local16 != null; local16 = (Class4_Sub38) this.aClass258_43.method5528()) {
			if (local16.method4997(arg0, arg1)) {
				local16.method4998(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIII[I)Z")
	public boolean method4923(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(15) Class4_Sub38 local15 = (Class4_Sub38) this.aClass258_43.method5538(); local15 != null; local15 = (Class4_Sub38) this.aClass258_43.method5528()) {
			if (local15.method4994(arg0, arg1, arg2)) {
				local15.method4993(arg3, arg2, arg0);
				return true;
			}
		}
		return false;
	}
}
