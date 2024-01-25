import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class330 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "C")
	public char aChar6;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
	private int anInt9173;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!ee;")
	public Class83 aClass83_38;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Lclient!ee;")
	private Class83 aClass83_39;

	@OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
	private int anInt9182;

	@OriginalMember(owner = "client!tc", name = "n", descriptor = "Ljava/lang/String;")
	private String aString108 = "null";

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)I")
	public int method8019(@OriginalArg(0) int arg0) {
		if (this.aClass83_38 == null) {
			return this.anInt9182;
		} else {
			@Pc(23) Class3_Sub33 local23 = (Class3_Sub33) this.aClass83_38.method2368((long) arg0);
			return local23 == null ? this.anInt9182 : local23.anInt4831;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
	private void method8020() {
		this.aClass83_39 = new Class83(this.aClass83_38.method2371());
		for (@Pc(24) Class3_Sub49 local24 = (Class3_Sub49) this.aClass83_38.method2375(); local24 != null; local24 = (Class3_Sub49) this.aClass83_38.method2370()) {
			@Pc(35) Class3_Sub37 local35 = new Class3_Sub37(local24.aString100, (int) local24.aLong311);
			this.aClass83_39.method2377(Static433.method7240(local24.aString100), local35);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLclient!jp;)V")
	public void method8021(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8632();
			if (local5 == 0) {
				return;
			}
			this.method8023(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILclient!jp;I)V")
	private void method8023(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar6 = Static375.method5437(arg0.method8621());
		} else if (arg1 == 2) {
			this.aChar5 = Static375.method5437(arg0.method8621());
		} else if (arg1 == 3) {
			this.aString108 = arg0.method8613();
		} else if (arg1 == 4) {
			this.anInt9182 = arg0.method8618();
		} else if (arg1 == 5 || arg1 == 6) {
			this.anInt9173 = arg0.method8593();
			this.aClass83_38 = new Class83(Static282.method4521(this.anInt9173));
			for (@Pc(57) int local57 = 0; local57 < this.anInt9173; local57++) {
				@Pc(63) int local63 = arg0.method8618();
				@Pc(75) Class3 local75;
				if (arg1 == 5) {
					local75 = new Class3_Sub49(arg0.method8613());
				} else {
					local75 = new Class3_Sub33(arg0.method8618());
				}
				this.aClass83_38.method2377((long) local63, local75);
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method8024(@OriginalArg(1) int arg0) {
		if (this.aClass83_38 == null) {
			return this.aString108;
		} else {
			@Pc(25) Class3_Sub49 local25 = (Class3_Sub49) this.aClass83_38.method2368((long) arg0);
			return local25 == null ? this.aString108 : local25.aString100;
		}
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)Z")
	public boolean method8025(@OriginalArg(0) int arg0) {
		if (this.aClass83_38 == null) {
			return false;
		}
		if (this.aClass83_39 == null) {
			this.method8026();
		}
		@Pc(24) Class3_Sub33 local24 = (Class3_Sub33) this.aClass83_39.method2368((long) arg0);
		return local24 != null;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
	private void method8026() {
		this.aClass83_39 = new Class83(this.aClass83_38.method2371());
		for (@Pc(27) Class3_Sub33 local27 = (Class3_Sub33) this.aClass83_38.method2375(); local27 != null; local27 = (Class3_Sub33) this.aClass83_38.method2370()) {
			@Pc(36) Class3_Sub33 local36 = new Class3_Sub33((int) local27.aLong311);
			this.aClass83_39.method2377((long) local27.anInt4831, local36);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method8027(@OriginalArg(0) String arg0) {
		if (this.aClass83_38 == null) {
			return false;
		}
		if (this.aClass83_39 == null) {
			this.method8020();
		}
		for (@Pc(33) Class3_Sub37 local33 = (Class3_Sub37) this.aClass83_39.method2368(Static433.method7240(arg0)); local33 != null; local33 = (Class3_Sub37) this.aClass83_39.method2373()) {
			if (local33.aString57.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
