import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jb")
public final class Class169 {

	@OriginalMember(owner = "client!jb", name = "h", descriptor = "Lclient!nga;")
	private final Class233 aClass233_25 = new Class233(16);

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!eq;")
	private final Class97 aClass97_64;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!cw;ILclient!eq;)V")
	public Class169(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2) {
		this.aClass97_64 = arg2;
		this.aClass97_64.method2569(29);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method4168() {
		@Pc(2) Class233 local2 = this.aClass233_25;
		synchronized (this.aClass233_25) {
			this.aClass233_25.method5665();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method4171() {
		@Pc(2) Class233 local2 = this.aClass233_25;
		synchronized (this.aClass233_25) {
			this.aClass233_25.method5663();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	public void method4173() {
		@Pc(2) Class233 local2 = this.aClass233_25;
		synchronized (this.aClass233_25) {
			this.aClass233_25.method5664(5);
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Lclient!dh;")
	private Class71 method4174(@OriginalArg(1) int arg0) {
		@Pc(6) Class233 local6 = this.aClass233_25;
		@Pc(16) Class71 local16;
		synchronized (this.aClass233_25) {
			local16 = (Class71) this.aClass233_25.method5669((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class97 local29 = this.aClass97_64;
		@Pc(38) byte[] local38;
		synchronized (this.aClass97_64) {
			local38 = this.aClass97_64.method2545(arg0, 29);
		}
		local16 = new Class71();
		if (local38 != null) {
			local16.method1618(new Class2_Sub34(local38));
		}
		@Pc(60) Class233 local60 = this.aClass233_25;
		synchronized (this.aClass233_25) {
			this.aClass233_25.method5662(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!um;IIIIB)Lclient!aj;")
	public Class17 method4175(@OriginalArg(0) Class343 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) Class144[] local5 = null;
		@Pc(10) Class71 local10 = this.method4174(arg1);
		if (local10.anIntArray165 != null) {
			local5 = new Class144[local10.anIntArray165.length];
			for (@Pc(20) int local20 = 0; local20 < local5.length; local20++) {
				@Pc(29) Class146 local29 = arg0.method8012(local10.anIntArray165[local20]);
				local5[local20] = new Class144(local29.anInt4336, local29.anInt4346, local29.anInt4344, local29.anInt4342, local29.anInt4340, local29.anInt4337, local29.anInt4339, local29.aBoolean363);
			}
		}
		return new Class17(local10.anInt1850, local5, local10.anInt1856, arg2, arg4, arg3);
	}
}
