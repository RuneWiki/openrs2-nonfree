import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class43 {

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[I")
	public static int[] anIntArray201 = new int[4096];

	@OriginalMember(owner = "client!id", name = "f", descriptor = "Lclient!me;")
	private Class2_Sub2 aClass2_Sub2_19 = new Class2_Sub2();

	@OriginalMember(owner = "client!id", name = "k", descriptor = "Lclient!sf;")
	private Class89 aClass89_3 = new Class89();

	@OriginalMember(owner = "client!id", name = "m", descriptor = "I")
	private int anInt2068;

	@OriginalMember(owner = "client!id", name = "n", descriptor = "I")
	private int anInt2069;

	@OriginalMember(owner = "client!id", name = "l", descriptor = "Lclient!ob;")
	private Class70 aClass70_5;

	static {
		for (@Pc(4) int local4 = 0; local4 < 4096; local4++) {
			anIntArray201[local4] = Static49.method966(local4);
		}
	}

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
	public Class43(@OriginalArg(0) int arg0) {
		this.anInt2068 = arg0;
		this.anInt2069 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass70_5 = new Class70(local19);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(JLclient!me;Z)V")
	public void method1462(@OriginalArg(0) long arg0, @OriginalArg(1) Class2_Sub2 arg1) {
		if (this.anInt2069 == 0) {
			@Pc(19) Class2_Sub2 local19 = this.aClass89_3.method2844();
			local19.method3314();
			local19.method3320();
			if (local19 == this.aClass2_Sub2_19) {
				local19 = this.aClass89_3.method2844();
				local19.method3314();
				local19.method3320();
			}
		} else {
			this.anInt2069--;
		}
		this.aClass70_5.method2208(arg0, arg1);
		this.aClass89_3.method2849(arg1);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lclient!g;")
	public Class2 method1463() {
		return this.aClass70_5.method2204();
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(JI)Lclient!me;")
	public Class2_Sub2 method1464(@OriginalArg(0) long arg0) {
		@Pc(16) Class2_Sub2 local16 = (Class2_Sub2) this.aClass70_5.method2205(arg0);
		if (local16 != null) {
			this.aClass89_3.method2849(local16);
		}
		return local16;
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(ZJ)V")
	public void method1465(@OriginalArg(1) long arg0) {
		@Pc(14) Class2_Sub2 local14 = (Class2_Sub2) this.aClass70_5.method2205(arg0);
		if (local14 != null) {
			local14.method3314();
			local14.method3320();
			this.anInt2069++;
		}
	}

	@OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
	public void method1469() {
		while (true) {
			@Pc(10) Class2_Sub2 local10 = this.aClass89_3.method2844();
			if (local10 == null) {
				this.anInt2069 = this.anInt2068;
				return;
			}
			local10.method3314();
			local10.method3320();
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)Lclient!g;")
	public Class2 method1470() {
		return this.aClass70_5.method2203();
	}
}
