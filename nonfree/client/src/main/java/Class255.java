import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class255 {

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "Lclient!mn;")
	public Class163 aClass163_40;

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "Lclient!mn;")
	private Class163 aClass163_41;

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "I")
	private int anInt7158;

	@OriginalMember(owner = "client!vu", name = "q", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!vu", name = "t", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!vu", name = "r", descriptor = "Ljava/lang/String;")
	private String aString64 = "null";

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(IB)I")
	public int method5648(@OriginalArg(0) int arg0) {
		if (this.aClass163_40 == null) {
			return this.anInt7158;
		} else {
			@Pc(22) Class2_Sub26 local22 = (Class2_Sub26) this.aClass163_40.method3769((long) arg0);
			return local22 == null ? this.anInt7158 : local22.anInt4485;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
	private void method5649() {
		this.aClass163_41 = new Class163(this.aClass163_40.method3768());
		for (@Pc(24) Class2_Sub4 local24 = (Class2_Sub4) this.aClass163_40.method3771(); local24 != null; local24 = (Class2_Sub4) this.aClass163_40.method3770()) {
			@Pc(35) Class2_Sub7 local35 = new Class2_Sub7(local24.aString2, (int) local24.aLong227);
			this.aClass163_41.method3764(Static215.method3374(local24.aString2), local35);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(II)Z")
	public boolean method5650(@OriginalArg(1) int arg0) {
		if (this.aClass163_40 == null) {
			return false;
		}
		if (this.aClass163_41 == null) {
			this.method5655();
		}
		@Pc(28) Class2_Sub26 local28 = (Class2_Sub26) this.aClass163_41.method3769((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method5652(@OriginalArg(1) String arg0) {
		if (this.aClass163_40 == null) {
			return false;
		}
		if (this.aClass163_41 == null) {
			this.method5649();
		}
		for (@Pc(35) Class2_Sub7 local35 = (Class2_Sub7) this.aClass163_41.method3769(Static215.method3374(arg0)); local35 != null; local35 = (Class2_Sub7) this.aClass163_41.method3765()) {
			if (local35.aString4.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(II)Ljava/lang/String;")
	public String method5653(@OriginalArg(1) int arg0) {
		if (this.aClass163_40 == null) {
			return this.aString64;
		} else {
			@Pc(22) Class2_Sub4 local22 = (Class2_Sub4) this.aClass163_40.method3769((long) arg0);
			return local22 == null ? this.aString64 : local22.aString2;
		}
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)V")
	private void method5655() {
		this.aClass163_41 = new Class163(this.aClass163_40.method3768());
		for (@Pc(28) Class2_Sub26 local28 = (Class2_Sub26) this.aClass163_40.method3771(); local28 != null; local28 = (Class2_Sub26) this.aClass163_40.method3770()) {
			@Pc(37) Class2_Sub26 local37 = new Class2_Sub26((int) local28.aLong227);
			this.aClass163_41.method3764((long) local28.anInt4485, local37);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLclient!si;)V")
	public void method5656(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5495();
			if (local17 == 0) {
				return;
			}
			this.method5657(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(BLclient!si;I)V")
	private void method5657(@OriginalArg(1) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static283.method1319(arg0.method5484());
		} else if (arg1 == 2) {
			this.aChar5 = Static283.method1319(arg0.method5484());
		} else if (arg1 == 3) {
			this.aString64 = arg0.method5494();
		} else if (arg1 == 4) {
			this.anInt7158 = arg0.method5508();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(36) int local36 = arg0.method5500();
			this.aClass163_40 = new Class163(Static51.method863(local36));
			for (@Pc(46) int local46 = 0; local46 < local36; local46++) {
				@Pc(52) int local52 = arg0.method5508();
				@Pc(64) Class2 local64;
				if (arg1 == 5) {
					local64 = new Class2_Sub4(arg0.method5494());
				} else {
					local64 = new Class2_Sub26(arg0.method5508());
				}
				this.aClass163_40.method3764((long) local52, local64);
			}
		}
	}
}
