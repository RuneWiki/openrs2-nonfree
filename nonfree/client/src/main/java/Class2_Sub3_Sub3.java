import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class2_Sub3_Sub3 extends Class2_Sub3 {

	@OriginalMember(owner = "client!eaa", name = "x", descriptor = "Z")
	public boolean aBoolean201 = true;

	@OriginalMember(owner = "client!eaa", name = "v", descriptor = "I")
	public int anInt2217 = -1;

	@OriginalMember(owner = "client!eaa", name = "s", descriptor = "I")
	public int anInt2214 = 12800;

	@OriginalMember(owner = "client!eaa", name = "C", descriptor = "I")
	public int anInt2222 = 0;

	@OriginalMember(owner = "client!eaa", name = "F", descriptor = "I")
	public int anInt2225 = 0;

	@OriginalMember(owner = "client!eaa", name = "H", descriptor = "I")
	public int anInt2226 = 12800;

	@OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
	public int anInt2218 = -1;

	@OriginalMember(owner = "client!eaa", name = "G", descriptor = "Ljava/lang/String;")
	public final String aString17;

	@OriginalMember(owner = "client!eaa", name = "u", descriptor = "I")
	public final int anInt2216;

	@OriginalMember(owner = "client!eaa", name = "I", descriptor = "Ljava/lang/String;")
	public final String aString18;

	@OriginalMember(owner = "client!eaa", name = "t", descriptor = "I")
	public final int anInt2215;

	@OriginalMember(owner = "client!eaa", name = "A", descriptor = "Lclient!ae;")
	public final Class8 aClass8_13;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt2218 = arg6;
		this.aString17 = arg2;
		this.aBoolean201 = arg5;
		this.anInt2217 = arg4;
		this.anInt2216 = arg3;
		this.aString18 = arg1;
		this.anInt2215 = arg0;
		if (this.anInt2218 == 255) {
			this.anInt2218 = 0;
		}
		this.aClass8_13 = new Class8();
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V")
	public void method1628() {
		this.anInt2225 = 0;
		this.anInt2222 = 0;
		this.anInt2226 = 12800;
		this.anInt2214 = 12800;
		for (@Pc(23) Class2_Sub33 local23 = (Class2_Sub33) this.aClass8_13.method210(); local23 != null; local23 = (Class2_Sub33) this.aClass8_13.method218()) {
			if (this.anInt2225 < local23.anInt6347) {
				this.anInt2225 = local23.anInt6347;
			}
			if (this.anInt2226 > local23.anInt6340) {
				this.anInt2226 = local23.anInt6340;
			}
			if (this.anInt2214 > local23.anInt6339) {
				this.anInt2214 = local23.anInt6339;
			}
			if (this.anInt2222 < local23.anInt6342) {
				this.anInt2222 = local23.anInt6342;
			}
		}
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IBI[I)Z")
	public boolean method1629(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		for (@Pc(11) Class2_Sub33 local11 = (Class2_Sub33) this.aClass8_13.method210(); local11 != null; local11 = (Class2_Sub33) this.aClass8_13.method218()) {
			if (local11.method5257(arg0, arg1)) {
				local11.method5260(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II[III)Z")
	public boolean method1630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(16) Class2_Sub33 local16 = (Class2_Sub33) this.aClass8_13.method210(); local16 != null; local16 = (Class2_Sub33) this.aClass8_13.method218()) {
			if (local16.method5261(arg0, arg1, arg3)) {
				local16.method5260(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)Z")
	public boolean method1631(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(11) Class2_Sub33 local11 = (Class2_Sub33) this.aClass8_13.method210(); local11 != null; local11 = (Class2_Sub33) this.aClass8_13.method218()) {
			if (local11.method5257(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II[IB)Z")
	public boolean method1632(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		for (@Pc(11) Class2_Sub33 local11 = (Class2_Sub33) this.aClass8_13.method210(); local11 != null; local11 = (Class2_Sub33) this.aClass8_13.method218()) {
			if (local11.method5262(arg0, arg1)) {
				local11.method5258(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
