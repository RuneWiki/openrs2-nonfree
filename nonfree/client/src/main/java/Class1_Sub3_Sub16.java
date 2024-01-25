import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class1_Sub3_Sub16 extends Class1_Sub3 {

	@OriginalMember(owner = "client!uq", name = "P", descriptor = "I")
	public int anInt6755 = -1;

	@OriginalMember(owner = "client!uq", name = "D", descriptor = "I")
	public int anInt6747 = 12800;

	@OriginalMember(owner = "client!uq", name = "I", descriptor = "I")
	public int anInt6750 = 0;

	@OriginalMember(owner = "client!uq", name = "O", descriptor = "Z")
	public boolean aBoolean552 = true;

	@OriginalMember(owner = "client!uq", name = "H", descriptor = "I")
	public int anInt6749 = 12800;

	@OriginalMember(owner = "client!uq", name = "T", descriptor = "I")
	public int anInt6758 = -1;

	@OriginalMember(owner = "client!uq", name = "V", descriptor = "I")
	public int anInt6760 = 0;

	@OriginalMember(owner = "client!uq", name = "B", descriptor = "Ljava/lang/String;")
	public final String aString56;

	@OriginalMember(owner = "client!uq", name = "M", descriptor = "I")
	public final int anInt6753;

	@OriginalMember(owner = "client!uq", name = "G", descriptor = "I")
	public final int anInt6748;

	@OriginalMember(owner = "client!uq", name = "E", descriptor = "Ljava/lang/String;")
	public final String aString57;

	@OriginalMember(owner = "client!uq", name = "F", descriptor = "Lclient!vp;")
	public final Class254 aClass254_43;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class1_Sub3_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString56 = arg1;
		this.anInt6753 = arg3;
		this.anInt6758 = arg4;
		this.aBoolean552 = arg5;
		this.anInt6748 = arg0;
		this.aString57 = arg2;
		this.anInt6755 = arg6;
		if (this.anInt6755 == 255) {
			this.anInt6755 = 0;
		}
		this.aClass254_43 = new Class254();
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
	public void method5174() {
		this.anInt6760 = 0;
		this.anInt6747 = 12800;
		this.anInt6750 = 0;
		this.anInt6749 = 12800;
		for (@Pc(23) Class1_Sub5 local23 = (Class1_Sub5) this.aClass254_43.method5437(); local23 != null; local23 = (Class1_Sub5) this.aClass254_43.method5433()) {
			if (this.anInt6760 < local23.anInt636) {
				this.anInt6760 = local23.anInt636;
			}
			if (local23.anInt638 < this.anInt6749) {
				this.anInt6749 = local23.anInt638;
			}
			if (local23.anInt634 < this.anInt6747) {
				this.anInt6747 = local23.anInt634;
			}
			if (local23.anInt639 > this.anInt6750) {
				this.anInt6750 = local23.anInt639;
			}
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BII)Z")
	public boolean method5175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(16) Class1_Sub5 local16 = (Class1_Sub5) this.aClass254_43.method5437(); local16 != null; local16 = (Class1_Sub5) this.aClass254_43.method5433()) {
			if (local16.method553(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "([IIBI)Z")
	public boolean method5177(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(19) Class1_Sub5 local19 = (Class1_Sub5) this.aClass254_43.method5437(); local19 != null; local19 = (Class1_Sub5) this.aClass254_43.method5433()) {
			if (local19.method553(arg1, arg2)) {
				local19.method552(arg1, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[IBII)Z")
	public boolean method5178(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) Class1_Sub5 local11 = (Class1_Sub5) this.aClass254_43.method5437(); local11 != null; local11 = (Class1_Sub5) this.aClass254_43.method5433()) {
			if (local11.method557(arg3, arg0, arg2)) {
				local11.method552(arg3, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[IIZ)Z")
	public boolean method5180(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		for (@Pc(17) Class1_Sub5 local17 = (Class1_Sub5) this.aClass254_43.method5437(); local17 != null; local17 = (Class1_Sub5) this.aClass254_43.method5433()) {
			if (local17.method551(arg2, arg0)) {
				local17.method556(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}
}
