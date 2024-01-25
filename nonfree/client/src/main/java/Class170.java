import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class170 {

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!st;")
	private final Class280 aClass280_8 = new Class280();

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	private int anInt5111;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
	private final int anInt5117;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!dea;")
	private final Class68 aClass68_41;

	static {
		new Class88("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
	public Class170(@OriginalArg(0) int arg0) {
		this.anInt5111 = arg0;
		this.anInt5117 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; arg0 > local16 + local16; local16 += local16) {
		}
		this.aClass68_41 = new Class68(local16);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public void method4281() {
		for (@Pc(11) Class12_Sub4_Sub4 local11 = (Class12_Sub4_Sub4) this.aClass280_8.method6892(); local11 != null; local11 = (Class12_Sub4_Sub4) this.aClass280_8.method6895()) {
			if (local11.method2650()) {
				local11.method7967();
				local11.method7959();
				this.anInt5111 += local11.anInt2903;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)I")
	public int method4282() {
		return this.anInt5111;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!fw;B)V")
	private void method4285(@OriginalArg(0) Interface5 arg0) {
		@Pc(17) long local17 = arg0.method430();
		for (@Pc(24) Class12_Sub4_Sub4 local24 = (Class12_Sub4_Sub4) this.aClass68_41.method1917(local17); local24 != null; local24 = (Class12_Sub4_Sub4) this.aClass68_41.method1918()) {
			if (local24.anInterface5_3.method431(arg0)) {
				this.method4294(local24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public void method4286() {
		this.aClass280_8.method6896();
		this.aClass68_41.method1922();
		this.anInt5111 = this.anInt5117;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public void method4287() {
		if (Static422.aClass241_1 == null) {
			return;
		}
		for (@Pc(13) Class12_Sub4_Sub4 local13 = (Class12_Sub4_Sub4) this.aClass280_8.method6892(); local13 != null; local13 = (Class12_Sub4_Sub4) this.aClass280_8.method6895()) {
			if (local13.method2650()) {
				if (local13.method2653() == null) {
					local13.method7967();
					local13.method7959();
					this.anInt5111 += local13.anInt2903;
				}
			} else if ((long) 5 < ++local13.aLong247) {
				@Pc(56) Class12_Sub4_Sub4 local56 = Static422.aClass241_1.method7935(local13);
				this.aClass68_41.method1916(local56, local13.aLong248);
				Static512.method7599(local56, local13);
				local13.method7967();
				local13.method7959();
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!fw;IILjava/lang/Object;)V")
	private void method4288(@OriginalArg(0) Interface5 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt5117 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4285(arg0);
		this.anInt5111--;
		while (this.anInt5111 < 0) {
			@Pc(39) Class12_Sub4_Sub4 local39 = (Class12_Sub4_Sub4) this.aClass280_8.method6888();
			this.method4294(local39);
		}
		@Pc(53) Class12_Sub4_Sub4_Sub1 local53 = new Class12_Sub4_Sub4_Sub1(arg0, arg1, 1);
		this.aClass68_41.method1916(local53, arg0.method430());
		this.aClass280_8.method6894(local53);
		local53.aLong247 = 0L;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!fw;ILjava/lang/Object;)V")
	public void method4289(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Object arg1) {
		this.method4288(arg0, arg1);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!fw;I)Ljava/lang/Object;")
	public Object method4290(@OriginalArg(0) Interface5 arg0) {
		@Pc(14) long local14 = arg0.method430();
		for (@Pc(21) Class12_Sub4_Sub4 local21 = (Class12_Sub4_Sub4) this.aClass68_41.method1917(local14); local21 != null; local21 = (Class12_Sub4_Sub4) this.aClass68_41.method1918()) {
			if (local21.anInterface5_3.method431(arg0)) {
				@Pc(35) Object local35 = local21.method2653();
				if (local35 != null) {
					if (local21.method2650()) {
						@Pc(80) Class12_Sub4_Sub4_Sub1 local80 = new Class12_Sub4_Sub4_Sub1(arg0, local35, local21.anInt2903);
						this.aClass68_41.method1916(local80, local21.aLong248);
						this.aClass280_8.method6894(local80);
						local80.aLong247 = 0L;
						local21.method7967();
						local21.method7959();
					} else {
						this.aClass280_8.method6894(local21);
						local21.aLong247 = 0L;
					}
					return local35;
				}
				local21.method7967();
				local21.method7959();
				this.anInt5111 += local21.anInt2903;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!nu;)V")
	private void method4294(@OriginalArg(1) Class12_Sub4_Sub4 arg0) {
		if (arg0 != null) {
			arg0.method7967();
			arg0.method7959();
			this.anInt5111 += arg0.anInt2903;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)I")
	public int method4296() {
		return this.anInt5117;
	}
}
