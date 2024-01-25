import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class355 {

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "Lclient!jt;")
	private final Class166 aClass166_65 = new Class166(16);

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "Lclient!vd;")
	private final Class353 aClass353_128;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!qg;ILclient!vd;)V")
	public Class355(@OriginalArg(0) Class271 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class353 arg2) {
		this.aClass353_128 = arg2;
		this.aClass353_128.method8422(29);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IZ)V")
	public void method8455() {
		@Pc(12) Class166 local12 = this.aClass166_65;
		synchronized (this.aClass166_65) {
			this.aClass166_65.method4809(5);
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
	public void method8456() {
		@Pc(10) Class166 local10 = this.aClass166_65;
		synchronized (this.aClass166_65) {
			this.aClass166_65.method4811();
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V")
	public void method8457() {
		@Pc(12) Class166 local12 = this.aClass166_65;
		synchronized (this.aClass166_65) {
			this.aClass166_65.method4802();
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(II)Lclient!mp;")
	private Class211 method8458(@OriginalArg(1) int arg0) {
		@Pc(6) Class166 local6 = this.aClass166_65;
		@Pc(16) Class211 local16;
		synchronized (this.aClass166_65) {
			local16 = (Class211) this.aClass166_65.method4805((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class353 local29 = this.aClass353_128;
		@Pc(38) byte[] local38;
		synchronized (this.aClass353_128) {
			local38 = this.aClass353_128.method8404(29, arg0);
		}
		local16 = new Class211();
		if (local38 != null) {
			local16.method5683(new Class6_Sub40(local38));
		}
		@Pc(68) Class166 local68 = this.aClass166_65;
		synchronized (this.aClass166_65) {
			this.aClass166_65.method4803(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!ve;IIIII)Lclient!q;")
	public Class264 method8459(@OriginalArg(0) Class354 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class282[] local7 = null;
		@Pc(12) Class211 local12 = this.method8458(arg3);
		if (local12.anIntArray413 != null) {
			local7 = new Class282[local12.anIntArray413.length];
			for (@Pc(28) int local28 = 0; local28 < local7.length; local28++) {
				@Pc(38) Class214 local38 = arg0.method8448(local12.anIntArray413[local28]);
				local7[local28] = new Class282(local38.anInt6672, local38.anInt6676, local38.anInt6670, local38.anInt6673, local38.anInt6674, local38.anInt6675, local38.anInt6677, local38.aBoolean438);
			}
		}
		return new Class264(local12.anInt6611, local7, local12.anInt6617, arg1, arg4, arg2);
	}
}
