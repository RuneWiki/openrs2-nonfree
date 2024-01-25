import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sha")
public final class Class2_Sub5_Sub19 extends Class2_Sub5 {

	@OriginalMember(owner = "client!sha", name = "A", descriptor = "I")
	public int anInt8661 = -1;

	@OriginalMember(owner = "client!sha", name = "G", descriptor = "I")
	public int anInt8665 = -1;

	@OriginalMember(owner = "client!sha", name = "P", descriptor = "I")
	public int anInt8669 = 12800;

	@OriginalMember(owner = "client!sha", name = "M", descriptor = "Z")
	public boolean aBoolean641 = true;

	@OriginalMember(owner = "client!sha", name = "N", descriptor = "I")
	public int anInt8668 = 0;

	@OriginalMember(owner = "client!sha", name = "I", descriptor = "I")
	public int anInt8666 = 0;

	@OriginalMember(owner = "client!sha", name = "R", descriptor = "I")
	public int anInt8671 = 12800;

	@OriginalMember(owner = "client!sha", name = "H", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "client!sha", name = "z", descriptor = "I")
	public final int anInt8660;

	@OriginalMember(owner = "client!sha", name = "C", descriptor = "I")
	public final int anInt8662;

	@OriginalMember(owner = "client!sha", name = "J", descriptor = "Ljava/lang/String;")
	public final String aString78;

	@OriginalMember(owner = "client!sha", name = "K", descriptor = "Lclient!nt;")
	public final Class238 aClass238_60;

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub5_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aString77 = arg1;
		this.anInt8660 = arg3;
		this.anInt8665 = arg6;
		this.anInt8662 = arg0;
		this.aString78 = arg2;
		this.anInt8661 = arg4;
		this.aBoolean641 = arg5;
		if (this.anInt8665 == 255) {
			this.anInt8665 = 0;
		}
		this.aClass238_60 = new Class238();
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBI)Z")
	public boolean method7271(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) Class2_Sub47 local9 = (Class2_Sub47) this.aClass238_60.method5833(); local9 != null; local9 = (Class2_Sub47) this.aClass238_60.method5838()) {
			if (local9.method7301(arg1, arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(B[III)Z")
	public boolean method7272(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(14) Class2_Sub47 local14 = (Class2_Sub47) this.aClass238_60.method5833(); local14 != null; local14 = (Class2_Sub47) this.aClass238_60.method5838()) {
			if (local14.method7301(arg2, arg1)) {
				local14.method7300(arg2, arg1, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(II[II)Z")
	public boolean method7275(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(9) Class2_Sub47 local9 = (Class2_Sub47) this.aClass238_60.method5833(); local9 != null; local9 = (Class2_Sub47) this.aClass238_60.method5838()) {
			if (local9.method7298(arg0, arg2)) {
				local9.method7299(arg0, arg1, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(III[II)Z")
	public boolean method7276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) Class2_Sub47 local9 = (Class2_Sub47) this.aClass238_60.method5833(); local9 != null; local9 = (Class2_Sub47) this.aClass238_60.method5838()) {
			if (local9.method7302(arg0, arg3, arg1)) {
				local9.method7300(arg3, arg0, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(B)V")
	public void method7277() {
		this.anInt8666 = 0;
		this.anInt8669 = 12800;
		this.anInt8668 = 0;
		this.anInt8671 = 12800;
		for (@Pc(29) Class2_Sub47 local29 = (Class2_Sub47) this.aClass238_60.method5833(); local29 != null; local29 = (Class2_Sub47) this.aClass238_60.method5838()) {
			if (local29.anInt8707 < this.anInt8669) {
				this.anInt8669 = local29.anInt8707;
			}
			if (local29.anInt8716 < this.anInt8671) {
				this.anInt8671 = local29.anInt8716;
			}
			if (local29.anInt8711 > this.anInt8668) {
				this.anInt8668 = local29.anInt8711;
			}
			if (local29.anInt8704 > this.anInt8666) {
				this.anInt8666 = local29.anInt8704;
			}
		}
	}
}
