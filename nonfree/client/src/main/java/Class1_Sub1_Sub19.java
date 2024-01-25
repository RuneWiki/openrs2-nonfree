import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!ur", name = "w", descriptor = "Lclient!br;")
	private Class26 aClass26_29;

	@OriginalMember(owner = "client!ur", name = "E", descriptor = "Lclient!br;")
	public Class26 aClass26_30;

	@OriginalMember(owner = "client!ur", name = "G", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
	private int anInt6176;

	@OriginalMember(owner = "client!ur", name = "H", descriptor = "Ljava/lang/String;")
	private String aString248 = "null";

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public String method5403(@OriginalArg(0) int arg0) {
		if (this.aClass26_30 == null) {
			return this.aString248;
		} else {
			@Pc(23) Class1_Sub26 local23 = (Class1_Sub26) this.aClass26_30.method870((long) arg0);
			return local23 == null ? this.aString248 : local23.aString169;
		}
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)V")
	private void method5404() {
		this.aClass26_29 = new Class26(this.aClass26_30.method881());
		for (@Pc(20) Class1_Sub37 local20 = (Class1_Sub37) this.aClass26_30.method871(); local20 != null; local20 = (Class1_Sub37) this.aClass26_30.method878()) {
			@Pc(35) Class1_Sub37 local35 = new Class1_Sub37((int) local20.aLong215);
			this.aClass26_29.method877((long) local20.anInt6000, local35);
		}
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(B)V")
	private void method5405() {
		this.aClass26_29 = new Class26(this.aClass26_30.method881());
		for (@Pc(28) Class1_Sub26 local28 = (Class1_Sub26) this.aClass26_30.method871(); local28 != null; local28 = (Class1_Sub26) this.aClass26_30.method878()) {
			@Pc(39) Class1_Sub10 local39 = new Class1_Sub10(local28.aString169, (int) local28.aLong215);
			this.aClass26_29.method877(Static286.method4916(local28.aString169), local39);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!eb;B)V")
	public void method5406(@OriginalArg(0) Class1_Sub7 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3141();
			if (local13 == 0) {
				return;
			}
			this.method5407(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!eb;II)V")
	private void method5407(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static307.method5174(arg0.method3130());
		} else if (arg1 == 2) {
			this.aChar5 = Static307.method5174(arg0.method3130());
		} else if (arg1 == 3) {
			this.aString248 = arg0.method3134();
		} else if (arg1 == 4) {
			this.anInt6176 = arg0.method3125();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(56) int local56 = arg0.method3115();
			this.aClass26_30 = new Class26(Static339.method5608(local56));
			for (@Pc(66) int local66 = 0; local66 < local56; local66++) {
				@Pc(72) int local72 = arg0.method3125();
				@Pc(82) Class1 local82;
				if (arg1 == 5) {
					local82 = new Class1_Sub26(arg0.method3134());
				} else {
					local82 = new Class1_Sub37(arg0.method3125());
				}
				this.aClass26_30.method877((long) local72, local82);
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)Z")
	public boolean method5408(@OriginalArg(1) int arg0) {
		if (this.aClass26_30 == null) {
			return false;
		}
		if (this.aClass26_29 == null) {
			this.method5404();
		}
		@Pc(22) Class1_Sub37 local22 = (Class1_Sub37) this.aClass26_29.method870((long) arg0);
		return local22 != null;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(II)I")
	public int method5409(@OriginalArg(0) int arg0) {
		if (this.aClass26_30 == null) {
			return this.anInt6176;
		} else {
			@Pc(22) Class1_Sub37 local22 = (Class1_Sub37) this.aClass26_30.method870((long) arg0);
			return local22 == null ? this.anInt6176 : local22.anInt6000;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5411(@OriginalArg(0) String arg0) {
		if (this.aClass26_30 == null) {
			return false;
		}
		if (this.aClass26_29 == null) {
			this.method5405();
		}
		for (@Pc(33) Class1_Sub10 local33 = (Class1_Sub10) this.aClass26_29.method870(Static286.method4916(arg0)); local33 != null; local33 = (Class1_Sub10) this.aClass26_29.method879()) {
			if (local33.aString41.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
