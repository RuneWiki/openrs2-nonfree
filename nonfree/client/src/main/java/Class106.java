import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class106 implements Interface6 {

	@OriginalMember(owner = "client!fp", name = "j", descriptor = "Lclient!ha;")
	private Class100 aClass100_8;

	@OriginalMember(owner = "client!fp", name = "n", descriptor = "Z")
	private boolean aBoolean247;

	@OriginalMember(owner = "client!fp", name = "e", descriptor = "Lclient!f;")
	private final Class88 aClass88_1;

	@OriginalMember(owner = "client!fp", name = "h", descriptor = "[Lclient!qd;")
	private final Interface21[] anInterface21Array1;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lclient!f;Lclient!vo;)V")
	public Class106(@OriginalArg(0) Class88 arg0, @OriginalArg(1) Class364 arg1) {
		this.aClass88_1 = arg0;
		this.anInterface21Array1 = new Interface21[this.aClass88_1.anInterface24Array1.length];
		for (@Pc(15) int local15 = 0; local15 < this.anInterface21Array1.length; local15++) {
			this.anInterface21Array1[local15] = arg1.method8517(this.aClass88_1.anInterface24Array1[local15]);
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IJ)Z")
	@Override
	public boolean method7222(@OriginalArg(1) long arg0) {
		return (long) this.aClass88_1.anInt2678 + arg0 <= Static32.method595();
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)I")
	@Override
	public int method7227() {
		@Pc(7) int local7 = 0;
		@Pc(10) Interface21[] local10 = this.anInterface21Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(25) Interface21 local25 = local10[local12];
			if (local25 == null || local25.method7901()) {
				local7++;
			}
		}
		return local7 * 100 / this.anInterface21Array1.length;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V")
	@Override
	public void method7226() {
		if (Static162.aClass100_7 != this.aClass100_8) {
			this.aClass100_8 = Static162.aClass100_7;
			this.aBoolean247 = true;
		}
		this.aClass100_8.GA(0);
		@Pc(22) Interface21[] local22 = this.anInterface21Array1;
		for (@Pc(31) int local31 = 0; local31 < local22.length; local31++) {
			@Pc(37) Interface21 local37 = local22[local31];
			if (local37 != null) {
				local37.method7902();
			}
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
	@Override
	public void method7224() {
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)I")
	@Override
	public int method7225() {
		return this.aClass88_1.anInt2679;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7223(@OriginalArg(1) boolean arg0) {
		@Pc(17) Interface21[] local17 = this.anInterface21Array1;
		for (@Pc(19) int local19 = 0; local19 < local17.length; local19++) {
			@Pc(25) Interface21 local25 = local17[local19];
			if (local25 != null) {
				local25.method7903();
			}
		}
		this.aBoolean247 = false;
	}
}
