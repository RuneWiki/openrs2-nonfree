import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rv")
public final class Class219 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	public int anInt6056 = 0;

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
	public int anInt6058 = 0;

	@OriginalMember(owner = "client!rv", name = "k", descriptor = "Lclient!ka;")
	private final Class132 aClass132_56 = new Class132(64);

	@OriginalMember(owner = "client!rv", name = "l", descriptor = "Lclient!ch;")
	private Interface3 anInterface3_1 = null;

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "Lclient!dk;")
	private final Class54 aClass54_98;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "Lclient!dk;")
	private final Class54 aClass54_99;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(ILclient!dk;Lclient!dk;Lclient!ch;)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) Interface3 arg3) {
		this.aClass54_98 = arg2;
		this.anInterface3_1 = arg3;
		this.aClass54_99 = arg1;
		if (this.aClass54_99 != null) {
			this.anInt6058 = this.aClass54_99.method1123(1);
		}
		if (this.aClass54_98 != null) {
			this.anInt6056 = this.aClass54_98.method1123(1);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)Lclient!ut;")
	public Class2_Sub5_Sub17 method4730(@OriginalArg(1) int arg0) {
		@Pc(23) Class2_Sub5_Sub17 local23 = (Class2_Sub5_Sub17) this.aClass132_56.method2701((long) arg0);
		if (local23 != null) {
			return local23;
		}
		@Pc(37) byte[] local37;
		if (arg0 < 32768) {
			local37 = this.aClass54_99.method1126(1, arg0);
		} else {
			local37 = this.aClass54_98.method1126(1, arg0 & 0x7FFF);
		}
		local23 = new Class2_Sub5_Sub17();
		local23.aClass219_2 = this;
		if (local37 != null) {
			local23.method5274(new Class2_Sub13(local37));
		}
		if (arg0 >= 32768) {
			local23.method5273();
		}
		this.aClass132_56.method2711(local23, (long) arg0);
		return local23;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "([IBLclient!de;J)Ljava/lang/String;")
	public String method4731(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class50 arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface3_1 != null) {
			@Pc(24) String local24 = this.anInterface3_1.method5449(arg2, arg1, arg0);
			if (local24 != null) {
				return local24;
			}
		}
		return Long.toString(arg2);
	}
}
