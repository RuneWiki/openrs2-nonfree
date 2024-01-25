import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class217 {

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!rp;")
	private final Class220 aClass220_47 = new Class220(16);

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "Lclient!lt;")
	private final Class158 aClass158_72;

	static {
		new Class231("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
	}

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!cm;ILclient!lt;)V")
	public Class217(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class158 arg2) {
		this.aClass158_72 = arg2;
		this.aClass158_72.method3683(29);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBLclient!lc;III)Lclient!da;")
	public Class46 method4849(@OriginalArg(0) int arg0, @OriginalArg(2) Class147 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class102[] local7 = null;
		@Pc(17) Class18 local17 = this.method4851(arg4);
		if (local17.anIntArray29 != null) {
			local7 = new Class102[local17.anIntArray29.length];
			for (@Pc(27) int local27 = 0; local27 < local7.length; local27++) {
				@Pc(37) Class159 local37 = arg1.method3375(local17.anIntArray29[local27]);
				local7[local27] = new Class102(local37.anInt4050, local37.anInt4044, local37.anInt4052, local37.anInt4049, local37.anInt4051, local37.anInt4047, local37.anInt4048, local37.aBoolean266);
			}
		}
		return new Class46(local17.anInt402, local7, local17.anInt401, arg2, arg3, arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lclient!av;")
	private Class18 method4851(@OriginalArg(0) int arg0) {
		@Pc(6) Class220 local6 = this.aClass220_47;
		@Pc(18) Class18 local18;
		synchronized (this.aClass220_47) {
			local18 = (Class18) this.aClass220_47.method4990((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(35) byte[] local35 = this.aClass158_72.method3672(arg0, 29);
		local18 = new Class18();
		if (local35 != null) {
			local18.method314(new Class6_Sub15(local35));
		}
		@Pc(51) Class220 local51 = this.aClass220_47;
		synchronized (this.aClass220_47) {
			this.aClass220_47.method4996(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	public void method4852() {
		@Pc(10) Class220 local10 = this.aClass220_47;
		synchronized (this.aClass220_47) {
			this.aClass220_47.method4987();
		}
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	public void method4854() {
		@Pc(13) Class220 local13 = this.aClass220_47;
		synchronized (this.aClass220_47) {
			this.aClass220_47.method4999();
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	public void method4856() {
		@Pc(2) Class220 local2 = this.aClass220_47;
		synchronized (this.aClass220_47) {
			this.aClass220_47.method4998(5);
		}
	}
}
