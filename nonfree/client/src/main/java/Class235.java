import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class235 {

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "Lclient!d;")
	private final Class44 aClass44_66 = new Class44(16);

	@OriginalMember(owner = "client!tv", name = "d", descriptor = "Lclient!um;")
	private final Class243 aClass243_233;

	static {
		new Class198("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Lclient!pt;ILclient!um;)V")
	public Class235(@OriginalArg(0) Class197 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class243 arg2) {
		this.aClass243_233 = arg2;
		this.aClass243_233.method5472(29);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(Lclient!nq;IIBII)Lclient!re;")
	public Class207 method5351(@OriginalArg(0) Class175 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class85[] local7 = null;
		@Pc(14) Class257 local14 = this.method5357(arg4);
		if (local14.anIntArray490 != null) {
			local7 = new Class85[local14.anIntArray490.length];
			for (@Pc(31) int local31 = 0; local31 < local7.length; local31++) {
				@Pc(41) Class22 local41 = arg0.method3556(local14.anIntArray490[local31]);
				local7[local31] = new Class85(local41.anInt670, local41.anInt674, local41.anInt666, local41.anInt669, local41.anInt673, local41.anInt671, local41.anInt667, local41.aBoolean58);
			}
		}
		return new Class207(local14.anInt7319, local7, local14.anInt7315, arg2, arg3, arg1);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(B)V")
	public void method5353() {
		@Pc(10) Class44 local10 = this.aClass44_66;
		synchronized (this.aClass44_66) {
			this.aClass44_66.method1024();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)V")
	public void method5354() {
		@Pc(6) Class44 local6 = this.aClass44_66;
		synchronized (this.aClass44_66) {
			this.aClass44_66.method1025(5);
		}
	}

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "(Z)V")
	public void method5356() {
		@Pc(2) Class44 local2 = this.aClass44_66;
		synchronized (this.aClass44_66) {
			this.aClass44_66.method1031();
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)Lclient!vs;")
	private Class257 method5357(@OriginalArg(1) int arg0) {
		@Pc(6) Class44 local6 = this.aClass44_66;
		@Pc(16) Class257 local16;
		synchronized (this.aClass44_66) {
			local16 = (Class257) this.aClass44_66.method1028((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class243 local29 = this.aClass243_233;
		@Pc(38) byte[] local38;
		synchronized (this.aClass243_233) {
			local38 = this.aClass243_233.method5455(arg0, 29);
		}
		local16 = new Class257();
		if (local38 != null) {
			local16.method5800(new Class5_Sub15(local38));
		}
		@Pc(68) Class44 local68 = this.aClass44_66;
		synchronized (this.aClass44_66) {
			this.aClass44_66.method1017((long) arg0, local16);
			return local16;
		}
	}
}
