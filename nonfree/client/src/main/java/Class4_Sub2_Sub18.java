import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class4_Sub2_Sub18 extends Class4_Sub2 {

	@OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
	public int anInt4536 = 0;

	@OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
	public int anInt4528 = 12800;

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
	public int anInt4527 = -1;

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
	public int anInt4535 = 12800;

	@OriginalMember(owner = "client!qh", name = "A", descriptor = "I")
	public int anInt4525 = 0;

	@OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
	public int anInt4541 = -1;

	@OriginalMember(owner = "client!qh", name = "W", descriptor = "Z")
	public boolean aBoolean283 = true;

	@OriginalMember(owner = "client!qh", name = "V", descriptor = "I")
	public int anInt4543;

	@OriginalMember(owner = "client!qh", name = "H", descriptor = "Ljava/lang/String;")
	public String aString150;

	@OriginalMember(owner = "client!qh", name = "T", descriptor = "Ljava/lang/String;")
	public String aString151;

	@OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
	public int anInt4530;

	@OriginalMember(owner = "client!qh", name = "J", descriptor = "Lclient!c;")
	public Class17 aClass17_19;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
	public Class4_Sub2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6) {
		this.anInt4543 = arg0;
		this.aString150 = arg1;
		this.anInt4527 = arg4;
		this.aString151 = arg2;
		this.aBoolean283 = arg5;
		this.anInt4530 = arg3;
		this.anInt4541 = arg6;
		if (this.anInt4541 == 255) {
			this.anInt4541 = 0;
		}
		this.aClass17_19 = new Class17();
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(IIII)[I")
	public int[] method3540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(17) Class4_Sub27 local17 = (Class4_Sub27) this.aClass17_19.method613(); local17 != null; local17 = (Class4_Sub27) this.aClass17_19.method607()) {
			if (local17.method3241(arg0, arg1, arg2)) {
				return local17.method3237(arg1, arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)[I")
	public int[] method3541(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(17) Class4_Sub27 local17 = (Class4_Sub27) this.aClass17_19.method613(); local17 != null; local17 = (Class4_Sub27) this.aClass17_19.method607()) {
			if (local17.method3240(arg0, arg1)) {
				return local17.method3238(arg1, arg0);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZI)Z")
	public boolean method3543(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class4_Sub27 local11 = (Class4_Sub27) this.aClass17_19.method613(); local11 != null; local11 = (Class4_Sub27) this.aClass17_19.method607()) {
			if (local11.method3239(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V")
	public void method3544() {
		this.anInt4536 = 0;
		this.anInt4525 = 0;
		this.anInt4535 = 12800;
		this.anInt4528 = 12800;
		for (@Pc(23) Class4_Sub27 local23 = (Class4_Sub27) this.aClass17_19.method613(); local23 != null; local23 = (Class4_Sub27) this.aClass17_19.method607()) {
			if (local23.anInt3988 > this.anInt4525) {
				this.anInt4525 = local23.anInt3988;
			}
			if (this.anInt4536 < local23.anInt3990) {
				this.anInt4536 = local23.anInt3990;
			}
			if (local23.anInt3991 < this.anInt4528) {
				this.anInt4528 = local23.anInt3991;
			}
			if (local23.anInt3989 < this.anInt4535) {
				this.anInt4535 = local23.anInt3989;
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIZ)[I")
	public int[] method3547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class4_Sub27 local11 = (Class4_Sub27) this.aClass17_19.method613(); local11 != null; local11 = (Class4_Sub27) this.aClass17_19.method607()) {
			if (local11.method3239(arg0, arg1)) {
				return local11.method3237(arg0, arg1);
			}
		}
		return null;
	}
}
