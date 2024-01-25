import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class4_Sub1_Sub18 extends Class4_Sub1 {

	@OriginalMember(owner = "client!tg", name = "D", descriptor = "I")
	public int anInt6944 = -1;

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
	public int anInt6945 = 12800;

	@OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
	public int anInt6954 = 12800;

	@OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
	public int anInt6942 = 0;

	@OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
	public int anInt6949 = 0;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "Z")
	public boolean aBoolean512 = true;

	@OriginalMember(owner = "client!tg", name = "H", descriptor = "I")
	public int anInt6948 = -1;

	@OriginalMember(owner = "client!tg", name = "M", descriptor = "I")
	public final int anInt6952;

	@OriginalMember(owner = "client!tg", name = "N", descriptor = "Ljava/lang/String;")
	public final String aString64;

	@OriginalMember(owner = "client!tg", name = "R", descriptor = "Ljava/lang/String;")
	public final String aString65;

	@OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
	public final int anInt6946;

	@OriginalMember(owner = "client!tg", name = "C", descriptor = "Lclient!gw;")
	public final Class91 aClass91_49;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class4_Sub1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt6952 = arg0;
		this.aBoolean512 = arg5;
		this.anInt6948 = arg4;
		this.aString64 = arg1;
		this.aString65 = arg2;
		this.anInt6946 = arg3;
		this.anInt6944 = arg6;
		if (this.anInt6944 == 255) {
			this.anInt6944 = 0;
		}
		this.aClass91_49 = new Class91();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[III)Z")
	public boolean method5560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class4_Sub22 local11 = (Class4_Sub22) this.aClass91_49.method2584(); local11 != null; local11 = (Class4_Sub22) this.aClass91_49.method2586()) {
			if (local11.method3841(arg3, arg0, arg1)) {
				local11.method3842(arg2, arg1, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)Z")
	public boolean method5561(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(13) Class4_Sub22 local13 = (Class4_Sub22) this.aClass91_49.method2584(); local13 != null; local13 = (Class4_Sub22) this.aClass91_49.method2586()) {
			if (local13.method3843(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II[II)Z")
	public boolean method5562(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) Class4_Sub22 local16 = (Class4_Sub22) this.aClass91_49.method2584(); local16 != null; local16 = (Class4_Sub22) this.aClass91_49.method2586()) {
			if (local16.method3843(arg0, arg2)) {
				local16.method3842(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([IIII)Z")
	public boolean method5563(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class4_Sub22 local11 = (Class4_Sub22) this.aClass91_49.method2584(); local11 != null; local11 = (Class4_Sub22) this.aClass91_49.method2586()) {
			if (local11.method3840(arg2, arg1)) {
				local11.method3839(arg0, arg2, arg1);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
	public void method5564() {
		this.anInt6945 = 12800;
		this.anInt6942 = 0;
		this.anInt6949 = 0;
		this.anInt6954 = 12800;
		for (@Pc(25) Class4_Sub22 local25 = (Class4_Sub22) this.aClass91_49.method2584(); local25 != null; local25 = (Class4_Sub22) this.aClass91_49.method2586()) {
			if (local25.anInt4479 > this.anInt6949) {
				this.anInt6949 = local25.anInt4479;
			}
			if (local25.anInt4473 > this.anInt6942) {
				this.anInt6942 = local25.anInt4473;
			}
			if (this.anInt6954 > local25.anInt4484) {
				this.anInt6954 = local25.anInt4484;
			}
			if (this.anInt6945 > local25.anInt4476) {
				this.anInt6945 = local25.anInt4476;
			}
		}
	}
}
