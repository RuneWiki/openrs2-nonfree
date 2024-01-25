import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class344 {

	@OriginalMember(owner = "client!tca", name = "f", descriptor = "Lclient!tja;")
	private final Class352 aClass352_61 = new Class352(16);

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "Lclient!bt;")
	private final Class34 aClass34_111;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lclient!mja;ILclient!bt;)V")
	public Class344(@OriginalArg(0) Class234 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2) {
		this.aClass34_111 = arg2;
		this.aClass34_111.method1233(29);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(II)V")
	public void method7518() {
		@Pc(6) Class352 local6 = this.aClass352_61;
		synchronized (this.aClass352_61) {
			this.aClass352_61.method7663(5);
		}
	}

	@OriginalMember(owner = "client!tca", name = "b", descriptor = "(II)Lclient!jj;")
	private Class180 method7520(@OriginalArg(0) int arg0) {
		@Pc(6) Class352 local6 = this.aClass352_61;
		@Pc(16) Class180 local16;
		synchronized (this.aClass352_61) {
			local16 = (Class180) this.aClass352_61.method7653((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class34 local29 = this.aClass34_111;
		@Pc(38) byte[] local38;
		synchronized (this.aClass34_111) {
			local38 = this.aClass34_111.method1239(29, arg0);
		}
		local16 = new Class180();
		if (local38 != null) {
			local16.method4068(new Class4_Sub11(local38));
		}
		@Pc(66) Class352 local66 = this.aClass352_61;
		synchronized (this.aClass352_61) {
			this.aClass352_61.method7655((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V")
	public void method7524() {
		@Pc(6) Class352 local6 = this.aClass352_61;
		synchronized (this.aClass352_61) {
			this.aClass352_61.method7656();
		}
	}

	@OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)V")
	public void method7525() {
		@Pc(6) Class352 local6 = this.aClass352_61;
		synchronized (this.aClass352_61) {
			this.aClass352_61.method7659();
		}
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIIIILclient!paa;)Lclient!sj;")
	public Class332 method7526(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class273 arg4) {
		@Pc(15) Class98[] local15 = null;
		@Pc(20) Class180 local20 = this.method7520(arg3);
		if (local20.anIntArray344 != null) {
			local15 = new Class98[local20.anIntArray344.length];
			for (@Pc(30) int local30 = 0; local30 < local15.length; local30++) {
				@Pc(40) Class162 local40 = arg4.method6186(local20.anIntArray344[local30]);
				local15[local30] = new Class98(local40.anInt4061, local40.anInt4067, local40.anInt4063, local40.anInt4069, local40.anInt4070, local40.anInt4065, local40.anInt4059, local40.aBoolean303);
			}
		}
		return new Class332(local20.anInt4500, local15, local20.anInt4503, arg2, arg1, arg0);
	}
}
