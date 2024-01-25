import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class13 {

	@OriginalMember(owner = "client!al", name = "b", descriptor = "I")
	public int anInt180 = 0;

	@OriginalMember(owner = "client!al", name = "e", descriptor = "I")
	public int anInt181 = 0;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "Lclient!fc;")
	private final Class77 aClass77_4 = new Class77(64);

	@OriginalMember(owner = "client!al", name = "j", descriptor = "Lclient!qd;")
	private Interface8 anInterface8_1 = null;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "Lclient!oi;")
	private final Class185 aClass185_3;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "Lclient!oi;")
	private final Class185 aClass185_4;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(ILclient!oi;Lclient!oi;Lclient!qd;)V")
	public Class13(@OriginalArg(0) int arg0, @OriginalArg(1) Class185 arg1, @OriginalArg(2) Class185 arg2, @OriginalArg(3) Interface8 arg3) {
		this.aClass185_3 = arg2;
		this.anInterface8_1 = arg3;
		this.aClass185_4 = arg1;
		if (this.aClass185_4 != null) {
			this.anInt181 = this.aClass185_4.method4011(1);
		}
		if (this.aClass185_3 != null) {
			this.anInt180 = this.aClass185_3.method4011(1);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)Lclient!hu;")
	public Class1_Sub3_Sub10 method198(@OriginalArg(0) int arg0) {
		@Pc(11) Class1_Sub3_Sub10 local11 = (Class1_Sub3_Sub10) this.aClass77_4.method1387((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass185_3.method4002(1, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass185_4.method4002(1, arg0);
		}
		local11 = new Class1_Sub3_Sub10();
		local11.aClass13_1 = this;
		if (local27 != null) {
			local11.method2182(new Class1_Sub19(local27));
		}
		if (arg0 >= 32768) {
			local11.method2178();
		}
		this.aClass77_4.method1396(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "([ILclient!mt;JI)Ljava/lang/String;")
	public String method200(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class165 arg1, @OriginalArg(2) long arg2) {
		if (this.anInterface8_1 != null) {
			@Pc(14) String local14 = this.anInterface8_1.method303(arg1, arg0, arg2);
			if (local14 != null) {
				return local14;
			}
		}
		return Long.toString(arg2);
	}
}
