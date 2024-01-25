import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pja")
public final class Class5_Sub1_Sub16 extends Class5_Sub1 {

	@OriginalMember(owner = "client!pja", name = "y", descriptor = "I")
	public int anInt7437 = 12800;

	@OriginalMember(owner = "client!pja", name = "v", descriptor = "I")
	public int anInt7436 = 0;

	@OriginalMember(owner = "client!pja", name = "x", descriptor = "I")
	public int anInt7439 = 12800;

	@OriginalMember(owner = "client!pja", name = "H", descriptor = "Z")
	public boolean aBoolean506 = true;

	@OriginalMember(owner = "client!pja", name = "E", descriptor = "I")
	public int anInt7447 = 0;

	@OriginalMember(owner = "client!pja", name = "z", descriptor = "I")
	public int anInt7448 = -1;

	@OriginalMember(owner = "client!pja", name = "C", descriptor = "I")
	public int anInt7445 = -1;

	@OriginalMember(owner = "client!pja", name = "P", descriptor = "Ljava/lang/String;")
	public final String aString88;

	@OriginalMember(owner = "client!pja", name = "K", descriptor = "I")
	public final int anInt7441;

	@OriginalMember(owner = "client!pja", name = "w", descriptor = "Ljava/lang/String;")
	public final String aString89;

	@OriginalMember(owner = "client!pja", name = "A", descriptor = "I")
	public final int anInt7442;

	@OriginalMember(owner = "client!pja", name = "L", descriptor = "Lclient!at;")
	public final Class20 aClass20_41;

	@OriginalMember(owner = "client!pja", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class5_Sub1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7448 = arg6;
		this.anInt7445 = arg4;
		this.aString88 = arg1;
		this.anInt7441 = arg0;
		this.aString89 = arg2;
		this.anInt7442 = arg3;
		this.aBoolean506 = arg5;
		if (this.anInt7448 == 255) {
			this.anInt7448 = 0;
		}
		this.aClass20_41 = new Class20();
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V")
	public void method6480() {
		this.anInt7436 = 0;
		this.anInt7439 = 12800;
		this.anInt7447 = 0;
		this.anInt7437 = 12800;
		for (@Pc(23) Class5_Sub33 local23 = (Class5_Sub33) this.aClass20_41.method378(); local23 != null; local23 = (Class5_Sub33) this.aClass20_41.method366()) {
			if (this.anInt7439 > local23.anInt5698) {
				this.anInt7439 = local23.anInt5698;
			}
			if (this.anInt7436 < local23.anInt5699) {
				this.anInt7436 = local23.anInt5699;
			}
			if (this.anInt7437 > local23.anInt5692) {
				this.anInt7437 = local23.anInt5692;
			}
			if (local23.anInt5690 > this.anInt7447) {
				this.anInt7447 = local23.anInt5690;
			}
		}
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)Z")
	public boolean method6481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(18) Class5_Sub33 local18 = (Class5_Sub33) this.aClass20_41.method378(); local18 != null; local18 = (Class5_Sub33) this.aClass20_41.method366()) {
			if (local18.method5109(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IIB[I)Z")
	public boolean method6482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class5_Sub33 local11 = (Class5_Sub33) this.aClass20_41.method378(); local11 != null; local11 = (Class5_Sub33) this.aClass20_41.method366()) {
			if (local11.method5109(arg1, arg0)) {
				local11.method5105(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(IIII[I)Z")
	public boolean method6483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(24) Class5_Sub33 local24 = (Class5_Sub33) this.aClass20_41.method378(); local24 != null; local24 = (Class5_Sub33) this.aClass20_41.method366()) {
			if (local24.method5107(arg1, arg2, arg0)) {
				local24.method5105(arg0, arg2, arg3);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!pja", name = "a", descriptor = "(I[III)Z")
	public boolean method6485(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(13) Class5_Sub33 local13 = (Class5_Sub33) this.aClass20_41.method378(); local13 != null; local13 = (Class5_Sub33) this.aClass20_41.method366()) {
			if (local13.method5108(arg2, arg0)) {
				local13.method5106(arg0, arg2, arg1);
				return true;
			}
		}
		if (12800 != 12800) {
			Static460.aClass282_40 = null;
		}
		return false;
	}
}
