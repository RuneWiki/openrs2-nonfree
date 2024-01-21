import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YITKGHWB")
public final class Class46 {

	@OriginalMember(owner = "client!YITKGHWB", name = "b", descriptor = "I")
	private int anInt775;

	@OriginalMember(owner = "client!YITKGHWB", name = "c", descriptor = "I")
	private int anInt776;

	@OriginalMember(owner = "client!YITKGHWB", name = "a", descriptor = "Z")
	private boolean aBoolean186 = true;

	@OriginalMember(owner = "client!YITKGHWB", name = "d", descriptor = "Lclient!YBEHHNFF;")
	private Class6_Sub1 aClass6_Sub1_35 = new Class6_Sub1();

	@OriginalMember(owner = "client!YITKGHWB", name = "h", descriptor = "Lclient!TSCGUBKV;")
	private Class36 aClass36_2 = new Class36(-433);

	@OriginalMember(owner = "client!YITKGHWB", name = "e", descriptor = "I")
	private int anInt777;

	@OriginalMember(owner = "client!YITKGHWB", name = "f", descriptor = "I")
	private int anInt778;

	@OriginalMember(owner = "client!YITKGHWB", name = "g", descriptor = "Lclient!ZZGAIEMG;")
	private Class50 aClass50_1;

	@OriginalMember(owner = "client!YITKGHWB", name = "<init>", descriptor = "(IB)V")
	public Class46(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt777 = arg0;
			this.anInt778 = arg0;
			@Pc(26) boolean local26 = false;
			this.aClass50_1 = new Class50(1024, 492);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("86779, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YITKGHWB", name = "a", descriptor = "(J)Lclient!YBEHHNFF;")
	public Class6_Sub1 method529(@OriginalArg(0) long arg0) {
		@Pc(5) Class6_Sub1 local5 = (Class6_Sub1) this.aClass50_1.method572(arg0);
		if (local5 == null) {
			this.anInt775++;
		} else {
			this.aClass36_2.method385(local5);
			this.anInt776++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!YITKGHWB", name = "a", descriptor = "(ZLclient!YBEHHNFF;J)V")
	public void method530(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt778 == 0) {
				@Pc(6) Class6_Sub1 local6 = this.aClass36_2.method386();
				local6.method542();
				local6.method543();
				if (local6 == this.aClass6_Sub1_35) {
					local6 = this.aClass36_2.method386();
					local6.method542();
					local6.method543();
				}
			} else {
				this.anInt778--;
			}
			this.aClass50_1.method573(arg1, arg0);
			this.aClass36_2.method385(arg0);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("7600, " + false + ", " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YITKGHWB", name = "a", descriptor = "()V")
	public void method531() {
		while (true) {
			@Pc(3) Class6_Sub1 local3 = this.aClass36_2.method386();
			if (local3 == null) {
				this.anInt778 = this.anInt777;
				return;
			}
			local3.method542();
			local3.method543();
		}
	}
}
