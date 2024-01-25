import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eg")
public final class Class97 {

	@OriginalMember(owner = "client!eg", name = "g", descriptor = "Lclient!kh;")
	private Class5_Sub3 aClass5_Sub3_12 = new Class5_Sub3();

	@OriginalMember(owner = "client!eg", name = "h", descriptor = "Lclient!ut;")
	private final Class358 aClass358_4 = new Class358();

	@OriginalMember(owner = "client!eg", name = "k", descriptor = "I")
	private final int anInt2673;

	@OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
	private int anInt2674;

	@OriginalMember(owner = "client!eg", name = "l", descriptor = "Lclient!rda;")
	private final Class300 aClass300_11;

	@OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(I)V")
	public Class97(@OriginalArg(0) int arg0) {
		this.anInt2673 = arg0;
		this.anInt2674 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; arg0 > local19 + local19; local19 += local19) {
		}
		this.aClass300_11 = new Class300(local19);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!kh;JI)V")
	public void method2400(@OriginalArg(0) Class5_Sub3 arg0, @OriginalArg(1) long arg1) {
		if (this.anInt2674 == 0) {
			@Pc(22) Class5_Sub3 local22 = this.aClass358_4.method8326();
			local22.method9052();
			local22.method8687();
			if (local22 == this.aClass5_Sub3_12) {
				local22 = this.aClass358_4.method8326();
				local22.method9052();
				local22.method8687();
			}
		} else {
			this.anInt2674--;
		}
		this.aClass300_11.method7191(arg0, arg1);
		this.aClass358_4.method8329(arg0);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
	public void method2402() {
		this.aClass358_4.method8327();
		this.aClass300_11.method7189();
		this.aClass5_Sub3_12 = new Class5_Sub3();
		this.anInt2674 = this.anInt2673;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(JI)V")
	public void method2403(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub3 local10 = (Class5_Sub3) this.aClass300_11.method7188(arg0);
		if (local10 != null) {
			local10.method9052();
			local10.method8687();
			this.anInt2674++;
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(JB)Lclient!kh;")
	public Class5_Sub3 method2405(@OriginalArg(0) long arg0) {
		@Pc(10) Class5_Sub3 local10 = (Class5_Sub3) this.aClass300_11.method7188(arg0);
		if (local10 != null) {
			this.aClass358_4.method8329(local10);
		}
		return local10;
	}
}
