import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oaa")
public final class Class233 {

	@OriginalMember(owner = "client!oaa", name = "d", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!oaa", name = "j", descriptor = "Lclient!wa;")
	public Class354 aClass354_31;

	@OriginalMember(owner = "client!oaa", name = "o", descriptor = "Lclient!wa;")
	private Class354 aClass354_32;

	@OriginalMember(owner = "client!oaa", name = "q", descriptor = "I")
	private int anInt6392;

	@OriginalMember(owner = "client!oaa", name = "s", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!oaa", name = "k", descriptor = "Ljava/lang/String;")
	private String aString45 = "null";

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ZI)Z")
	public boolean method5418(@OriginalArg(1) int arg0) {
		if (this.aClass354_31 == null) {
			return false;
		}
		if (this.aClass354_32 == null) {
			this.method5428();
		}
		@Pc(22) Class3_Sub17 local22 = (Class3_Sub17) this.aClass354_32.method7689((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(ILclient!np;)V")
	public void method5420(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5175();
			if (local13 == 0) {
				return;
			}
			this.method5422(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)V")
	private void method5421() {
		this.aClass354_32 = new Class354(this.aClass354_31.method7697());
		for (@Pc(28) Class3_Sub29 local28 = (Class3_Sub29) this.aClass354_31.method7694(); local28 != null; local28 = (Class3_Sub29) this.aClass354_31.method7692()) {
			@Pc(39) Class3_Sub16 local39 = new Class3_Sub16(local28.aString27, (int) local28.aLong273);
			this.aClass354_32.method7691(local39, Static142.method2758(local28.aString27));
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IILclient!np;)V")
	private void method5422(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub11 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static231.method3591(arg1.method5212());
		} else if (arg0 == 2) {
			this.aChar5 = Static231.method3591(arg1.method5212());
		} else if (arg0 == 3) {
			this.aString45 = arg1.method5181();
		} else if (arg0 == 4) {
			this.anInt6392 = arg1.method5186();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(33) int local33 = arg1.method5198();
			this.aClass354_31 = new Class354(Static371.method5424(local33));
			for (@Pc(43) int local43 = 0; local43 < local33; local43++) {
				@Pc(49) int local49 = arg1.method5186();
				@Pc(59) Class3 local59;
				if (arg0 == 5) {
					local59 = new Class3_Sub29(arg1.method5181());
				} else {
					local59 = new Class3_Sub17(arg1.method5186());
				}
				this.aClass354_31.method7691(local59, (long) local49);
			}
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(II)I")
	public int method5423(@OriginalArg(1) int arg0) {
		if (this.aClass354_31 == null) {
			return this.anInt6392;
		} else {
			@Pc(25) Class3_Sub17 local25 = (Class3_Sub17) this.aClass354_31.method7689((long) arg0);
			return local25 == null ? this.anInt6392 : local25.anInt3217;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(ZI)Ljava/lang/String;")
	public String method5426(@OriginalArg(1) int arg0) {
		if (this.aClass354_31 == null) {
			return this.aString45;
		} else {
			@Pc(22) Class3_Sub29 local22 = (Class3_Sub29) this.aClass354_31.method7689((long) arg0);
			return local22 == null ? this.aString45 : local22.aString27;
		}
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5427(@OriginalArg(0) String arg0) {
		if (this.aClass354_31 == null) {
			return false;
		}
		if (this.aClass354_32 == null) {
			this.method5421();
		}
		for (@Pc(25) Class3_Sub16 local25 = (Class3_Sub16) this.aClass354_32.method7689(Static142.method2758(arg0)); local25 != null; local25 = (Class3_Sub16) this.aClass354_32.method7693()) {
			if (local25.aString12.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)V")
	private void method5428() {
		this.aClass354_32 = new Class354(this.aClass354_31.method7697());
		for (@Pc(24) Class3_Sub17 local24 = (Class3_Sub17) this.aClass354_31.method7694(); local24 != null; local24 = (Class3_Sub17) this.aClass354_31.method7692()) {
			@Pc(33) Class3_Sub17 local33 = new Class3_Sub17((int) local24.aLong273);
			this.aClass354_32.method7691(local33, (long) local24.anInt3217);
		}
	}
}
