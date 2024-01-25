import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class313 {

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "[I")
	public static final int[] anIntArray833 = new int[256];

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "Lclient!gba;")
	private final Class104 aClass104_10 = new Class104();

	@OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
	private final int anInt8997;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	private int anInt9003;

	@OriginalMember(owner = "client!wg", name = "n", descriptor = "Lclient!ba;")
	private final Class17 aClass17_41;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray833[local4] = local7;
		}
		new Class306("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V")
	public Class313(@OriginalArg(0) int arg0) {
		this.anInt8997 = arg0;
		this.anInt9003 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; local14 + local14 < arg0; local14 += local14) {
		}
		this.aClass17_41 = new Class17(local14);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)I")
	public int method7395() {
		return this.anInt8997;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)Ljava/lang/Object;")
	public Object method7396() {
		@Pc(11) Class1_Sub1_Sub16 local11 = (Class1_Sub1_Sub16) this.aClass17_41.method735();
		while (local11 != null) {
			@Pc(17) Object local17 = local11.method7391();
			if (local17 != null) {
				return local17;
			}
			@Pc(23) Class1_Sub1_Sub16 local23 = local11;
			local11 = (Class1_Sub1_Sub16) this.aClass17_41.method740();
			local23.method7525();
			local23.method7528();
			this.anInt9003 += local11.anInt8985;
		}
		return null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(JLjava/lang/Object;II)V")
	private void method7397(@OriginalArg(0) long arg0, @OriginalArg(1) Object arg1) {
		if (this.anInt8997 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method7409(arg0);
		this.anInt9003--;
		while (this.anInt9003 < 0) {
			@Pc(37) Class1_Sub1_Sub16 local37 = (Class1_Sub1_Sub16) this.aClass104_10.method2418();
			this.method7405(local37);
		}
		@Pc(52) Class1_Sub1_Sub16_Sub1 local52 = new Class1_Sub1_Sub16_Sub1(arg1, 1);
		this.aClass17_41.method737(local52, arg0);
		this.aClass104_10.method2420(local52);
		local52.aLong394 = 0L;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V")
	public void method7398() {
		this.aClass104_10.method2419();
		this.aClass17_41.method734();
		this.anInt9003 = this.anInt8997;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(JBLjava/lang/Object;)V")
	public void method7399(@OriginalArg(0) long arg0, @OriginalArg(2) Object arg1) {
		this.method7397(arg0, arg1);
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
	public void method7400() {
		for (@Pc(5) Class1_Sub1_Sub16 local5 = (Class1_Sub1_Sub16) this.aClass104_10.method2414(); local5 != null; local5 = (Class1_Sub1_Sub16) this.aClass104_10.method2417()) {
			if (local5.method7389()) {
				local5.method7525();
				local5.method7528();
				this.anInt9003 += local5.anInt8985;
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)I")
	public int method7401() {
		return this.anInt9003;
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)I")
	public int method7402() {
		@Pc(7) int local7 = 0;
		for (@Pc(21) Class1_Sub1_Sub16 local21 = (Class1_Sub1_Sub16) this.aClass104_10.method2414(); local21 != null; local21 = (Class1_Sub1_Sub16) this.aClass104_10.method2417()) {
			if (!local21.method7389()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	public void method7403(@OriginalArg(0) int arg0) {
		if (Static434.aClass34_1 == null) {
			return;
		}
		for (@Pc(13) Class1_Sub1_Sub16 local13 = (Class1_Sub1_Sub16) this.aClass104_10.method2414(); local13 != null; local13 = (Class1_Sub1_Sub16) this.aClass104_10.method2417()) {
			if (local13.method7389()) {
				if (local13.method7391() == null) {
					local13.method7525();
					local13.method7528();
					this.anInt9003++;
				}
			} else if (++local13.aLong394 > (long) arg0) {
				@Pc(63) Class1_Sub1_Sub16 local63 = Static434.aClass34_1.method945(local13);
				this.aClass17_41.method737(local63, local13.aLong392);
				Static101.method6349(local13, local63);
				local13.method7525();
				local13.method7528();
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public Object method7404() {
		@Pc(19) Class1_Sub1_Sub16 local19 = (Class1_Sub1_Sub16) this.aClass17_41.method740();
		while (local19 != null) {
			@Pc(25) Object local25 = local19.method7391();
			if (local25 != null) {
				return local25;
			}
			@Pc(31) Class1_Sub1_Sub16 local31 = local19;
			local19 = (Class1_Sub1_Sub16) this.aClass17_41.method740();
			local31.method7525();
			local31.method7528();
			this.anInt9003 += local19.anInt8985;
		}
		return null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!pk;I)V")
	private void method7405(@OriginalArg(0) Class1_Sub1_Sub16 arg0) {
		if (arg0 != null) {
			arg0.method7525();
			arg0.method7528();
			this.anInt9003 += arg0.anInt8985;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(JI)Ljava/lang/Object;")
	public Object method7406(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub1_Sub16 local10 = (Class1_Sub1_Sub16) this.aClass17_41.method738(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(18) Object local18 = local10.method7391();
		if (local18 == null) {
			local10.method7525();
			local10.method7528();
			this.anInt9003 += local10.anInt8985;
			return null;
		}
		if (local10.method7389()) {
			@Pc(60) Class1_Sub1_Sub16_Sub1 local60 = new Class1_Sub1_Sub16_Sub1(local18, local10.anInt8985);
			this.aClass17_41.method737(local60, local10.aLong392);
			this.aClass104_10.method2420(local60);
			local60.aLong394 = 0L;
			local10.method7525();
			local10.method7528();
		} else {
			this.aClass104_10.method2420(local10);
			local10.aLong394 = 0L;
		}
		return local18;
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "(JI)V")
	private void method7409(@OriginalArg(0) long arg0) {
		@Pc(14) Class1_Sub1_Sub16 local14 = (Class1_Sub1_Sub16) this.aClass17_41.method738(arg0);
		this.method7405(local14);
	}
}
