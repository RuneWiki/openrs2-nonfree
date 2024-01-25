import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class2_Sub7_Sub9 extends Class2_Sub7 {

	@OriginalMember(owner = "client!je", name = "B", descriptor = "Lclient!wb;")
	private Class243 aClass243_14;

	static {
		new Class62("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!vt;II)V")
	private void method2829(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(14) int local14 = arg0.method5732();
		@Pc(21) int local21;
		if (this.aClass243_14 == null) {
			local21 = Static279.method4638(local14);
			this.aClass243_14 = new Class243(local21);
		}
		for (local21 = 0; local21 < local14; local21++) {
			@Pc(42) boolean local42 = arg0.method5732() == 1;
			@Pc(46) int local46 = arg0.method5736();
			@Pc(55) Class2 local55;
			if (local42) {
				local55 = new Class2_Sub31(arg0.method5744());
			} else {
				local55 = new Class2_Sub16(arg0.method5776());
			}
			this.aClass243_14.method5968((long) local46, local55);
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)I")
	public int method2831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass243_14 == null) {
			return arg1;
		} else {
			@Pc(22) Class2_Sub16 local22 = (Class2_Sub16) this.aClass243_14.method5967((long) arg0);
			return local22 == null ? arg1 : local22.anInt2601;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method2832(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass243_14 == null) {
			return arg1;
		} else {
			@Pc(21) Class2_Sub31 local21 = (Class2_Sub31) this.aClass243_14.method5967((long) arg0);
			return local21 == null ? arg1 : local21.aString50;
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!vt;)V")
	public void method2834(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5732();
			if (local13 == 0) {
				return;
			}
			this.method2829(arg0, local13);
		}
	}
}
