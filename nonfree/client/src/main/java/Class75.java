import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public final class Class75 {

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
	private int anInt1593;

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!oj;")
	private Class234 aClass234_10;

	@OriginalMember(owner = "client!dj", name = "i", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!dj", name = "k", descriptor = "Lclient!oj;")
	public Class234 aClass234_11;

	@OriginalMember(owner = "client!dj", name = "o", descriptor = "Ljava/lang/String;")
	private String aString7 = "null";

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	private void method1452() {
		this.aClass234_10 = new Class234(this.aClass234_11.method5461());
		for (@Pc(26) Class6_Sub36 local26 = (Class6_Sub36) this.aClass234_11.method5469(); local26 != null; local26 = (Class6_Sub36) this.aClass234_11.method5465()) {
			@Pc(37) Class6_Sub37 local37 = new Class6_Sub37(local26.aString54, (int) local26.aLong245);
			this.aClass234_10.method5466(Static435.method6166(local26.aString54), local37);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	private void method1453() {
		this.aClass234_10 = new Class234(this.aClass234_11.method5461());
		for (@Pc(24) Class6_Sub14 local24 = (Class6_Sub14) this.aClass234_11.method5469(); local24 != null; local24 = (Class6_Sub14) this.aClass234_11.method5465()) {
			@Pc(33) Class6_Sub14 local33 = new Class6_Sub14((int) local24.aLong245);
			this.aClass234_10.method5466((long) local24.anInt2188, local33);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILclient!jr;)V")
	public void method1454(@OriginalArg(1) Class6_Sub12 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method6019();
			if (local13 == 0) {
				return;
			}
			this.method1461(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method1456(@OriginalArg(0) int arg0) {
		if (this.aClass234_11 == null) {
			return this.aString7;
		} else {
			@Pc(25) Class6_Sub36 local25 = (Class6_Sub36) this.aClass234_11.method5464((long) arg0);
			return local25 == null ? this.aString7 : local25.aString54;
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Z")
	public boolean method1457(@OriginalArg(0) int arg0) {
		if (this.aClass234_11 == null) {
			return false;
		}
		if (this.aClass234_10 == null) {
			this.method1453();
		}
		@Pc(28) Class6_Sub14 local28 = (Class6_Sub14) this.aClass234_10.method5464((long) arg0);
		return local28 != null;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method1458(@OriginalArg(1) String arg0) {
		if (this.aClass234_11 == null) {
			return false;
		}
		if (this.aClass234_10 == null) {
			this.method1452();
		}
		for (@Pc(25) Class6_Sub37 local25 = (Class6_Sub37) this.aClass234_10.method5464(Static435.method6166(arg0)); local25 != null; local25 = (Class6_Sub37) this.aClass234_10.method5467()) {
			if (local25.aString55.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BI)I")
	public int method1460(@OriginalArg(1) int arg0) {
		if (this.aClass234_11 == null) {
			return this.anInt1593;
		} else {
			@Pc(25) Class6_Sub14 local25 = (Class6_Sub14) this.aClass234_11.method5464((long) arg0);
			return local25 == null ? this.anInt1593 : local25.anInt2188;
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLclient!jr;I)V")
	private void method1461(@OriginalArg(1) Class6_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static58.method838(arg0.method6049());
		} else if (arg1 == 2) {
			this.aChar1 = Static58.method838(arg0.method6049());
		} else if (arg1 == 3) {
			this.aString7 = arg0.method6040();
		} else if (arg1 == 4) {
			this.anInt1593 = arg0.method6015();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(52) int local52 = arg0.method6044();
			this.aClass234_11 = new Class234(Static14.method5936(local52));
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				@Pc(68) int local68 = arg0.method6015();
				@Pc(80) Class6 local80;
				if (arg1 == 5) {
					local80 = new Class6_Sub36(arg0.method6040());
				} else {
					local80 = new Class6_Sub14(arg0.method6015());
				}
				this.aClass234_11.method5466((long) local68, local80);
			}
		}
	}
}
