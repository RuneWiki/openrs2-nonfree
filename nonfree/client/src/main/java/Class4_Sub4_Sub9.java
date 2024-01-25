import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class4_Sub4_Sub9 extends Class4_Sub4 {

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
	private int anInt3628;

	@OriginalMember(owner = "client!ko", name = "O", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!ko", name = "Q", descriptor = "Lclient!dj;")
	private Class43 aClass43_21;

	@OriginalMember(owner = "client!ko", name = "T", descriptor = "Lclient!dj;")
	public Class43 aClass43_22;

	@OriginalMember(owner = "client!ko", name = "U", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!ko", name = "P", descriptor = "Ljava/lang/String;")
	private String aString33 = "null";

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!lf;ZI)V")
	private void method3289(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar1 = Static36.method745(arg0.method3426());
		} else if (arg1 == 2) {
			this.aChar2 = Static36.method745(arg0.method3426());
		} else if (arg1 == 3) {
			this.aString33 = arg0.method3446();
		} else if (arg1 == 4) {
			this.anInt3628 = arg0.method3418();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(43) int local43 = arg0.method3401();
			this.aClass43_22 = new Class43(Static28.method5505(local43));
			for (@Pc(53) int local53 = 0; local53 < local43; local53++) {
				@Pc(59) int local59 = arg0.method3418();
				@Pc(71) Class4 local71;
				if (arg1 == 5) {
					local71 = new Class4_Sub26(arg0.method3446());
				} else {
					local71 = new Class4_Sub8(arg0.method3418());
				}
				this.aClass43_22.method1276(local71, (long) local59);
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I")
	public int method3290(@OriginalArg(0) int arg0) {
		if (this.aClass43_22 == null) {
			return this.anInt3628;
		} else {
			@Pc(22) Class4_Sub8 local22 = (Class4_Sub8) this.aClass43_22.method1273((long) arg0);
			return local22 == null ? this.anInt3628 : local22.anInt492;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(I)V")
	private void method3291() {
		this.aClass43_21 = new Class43(this.aClass43_22.method1274());
		for (@Pc(18) Class4_Sub8 local18 = (Class4_Sub8) this.aClass43_22.method1283(); local18 != null; local18 = (Class4_Sub8) this.aClass43_22.method1278()) {
			@Pc(29) Class4_Sub8 local29 = new Class4_Sub8((int) local18.aLong223);
			this.aClass43_21.method1276(local29, (long) local18.anInt492);
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3293(@OriginalArg(1) String arg0) {
		if (this.aClass43_22 == null) {
			return false;
		}
		if (this.aClass43_21 == null) {
			this.method3298();
		}
		for (@Pc(32) Class4_Sub24 local32 = (Class4_Sub24) this.aClass43_21.method1273(Static43.method840(arg0)); local32 != null; local32 = (Class4_Sub24) this.aClass43_21.method1279()) {
			if (local32.aString32.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(ZLclient!lf;)V")
	public void method3296(@OriginalArg(1) Class4_Sub11 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method3440();
			if (local16 == 0) {
				return;
			}
			this.method3289(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(B)V")
	private void method3298() {
		this.aClass43_21 = new Class43(this.aClass43_22.method1274());
		for (@Pc(26) Class4_Sub26 local26 = (Class4_Sub26) this.aClass43_22.method1283(); local26 != null; local26 = (Class4_Sub26) this.aClass43_22.method1278()) {
			@Pc(37) Class4_Sub24 local37 = new Class4_Sub24(local26.aString35, (int) local26.aLong223);
			this.aClass43_21.method1276(local37, Static43.method840(local26.aString35));
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(IB)Ljava/lang/String;")
	public String method3299(@OriginalArg(0) int arg0) {
		if (this.aClass43_22 == null) {
			return this.aString33;
		} else {
			@Pc(23) Class4_Sub26 local23 = (Class4_Sub26) this.aClass43_22.method1273((long) arg0);
			return local23 == null ? this.aString33 : local23.aString35;
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(ZI)Z")
	public boolean method3300(@OriginalArg(1) int arg0) {
		if (this.aClass43_22 == null) {
			return false;
		}
		if (this.aClass43_21 == null) {
			this.method3291();
		}
		@Pc(27) Class4_Sub8 local27 = (Class4_Sub8) this.aClass43_21.method1273((long) arg0);
		return local27 != null;
	}
}
