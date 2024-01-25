import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nl")
public final class Class231 implements Interface13 {

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "Lclient!r;")
	private Class43 aClass43_8;

	@OriginalMember(owner = "client!nl", name = "k", descriptor = "Z")
	private boolean aBoolean506;

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Lclient!pda;")
	private final Class254 aClass254_1;

	@OriginalMember(owner = "client!nl", name = "n", descriptor = "[Lclient!cca;")
	private final Interface4[] anInterface4Array1;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(Lclient!pda;Lclient!sn;)V")
	public Class231(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class311 arg1) {
		this.aClass254_1 = arg0;
		this.anInterface4Array1 = new Interface4[this.aClass254_1.anInterface14Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface4Array1.length; local15++) {
			this.anInterface4Array1[local15] = arg1.method6621(this.aClass254_1.anInterface14Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I")
	@Override
	public int method5346() {
		@Pc(14) int local14 = 0;
		@Pc(17) Interface4[] local17 = this.anInterface4Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Interface4 local25 = local17[local19];
			if (local25 == null || local25.method7790()) {
				local14++;
			}
		}
		return local14 * 100 / this.anInterface4Array1.length;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(JI)Z")
	@Override
	public boolean method5344(@OriginalArg(0) long arg0) {
		return Static587.method7753() >= arg0 + (long) this.aClass254_1.anInt6808;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V")
	@Override
	public void method5348() {
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)I")
	@Override
	public int method5347() {
		return this.aClass254_1.anInt6807;
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5345(@OriginalArg(0) boolean arg0) {
		@Pc(15) Interface4[] local15 = this.anInterface4Array1;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Interface4 local23 = local15[local17];
			if (local23 != null) {
				local23.method7788();
			}
		}
		this.aBoolean506 = false;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	@Override
	public void method5349() {
		if (Static4.aClass43_1 != this.aClass43_8) {
			this.aBoolean506 = true;
			this.aClass43_8 = Static4.aClass43_1;
		}
		this.aClass43_8.ja(0);
		@Pc(30) Interface4[] local30 = this.anInterface4Array1;
		for (@Pc(32) int local32 = 0; local32 < local30.length; local32++) {
			@Pc(38) Interface4 local38 = local30[local32];
			if (local38 != null) {
				local38.method7789();
			}
		}
	}
}
