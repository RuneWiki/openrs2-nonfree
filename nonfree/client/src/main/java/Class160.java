import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class160 {

	@OriginalMember(owner = "client!p", name = "v", descriptor = "Lclient!ig;")
	private final Class89 aClass89_5 = new Class89();

	@OriginalMember(owner = "client!p", name = "l", descriptor = "I")
	private final int anInt4748;

	@OriginalMember(owner = "client!p", name = "i", descriptor = "I")
	private int anInt4745;

	@OriginalMember(owner = "client!p", name = "d", descriptor = "Lclient!dq;")
	private final Class38 aClass38_28;

	static {
		new Class106("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!p", name = "<init>", descriptor = "(I)V")
	public Class160(@OriginalArg(0) int arg0) {
		this.anInt4748 = arg0;
		this.anInt4745 = arg0;
		@Pc(16) int local16;
		for (local16 = 1; local16 + local16 < arg0; local16 += local16) {
		}
		this.aClass38_28 = new Class38(local16);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Object;Lclient!ur;I)V")
	public void method4348(@OriginalArg(0) Object arg0, @OriginalArg(1) Interface10 arg1) {
		this.method4359(arg1, arg0);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public void method4349() {
		this.aClass89_5.method2723();
		this.aClass38_28.method1466();
		this.anInt4745 = this.anInt4748;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public void method4351() {
		if (Static181.aClass8_1 == null) {
			return;
		}
		for (@Pc(15) Class1_Sub4_Sub8 local15 = (Class1_Sub4_Sub8) this.aClass89_5.method2718(); local15 != null; local15 = (Class1_Sub4_Sub8) this.aClass89_5.method2726()) {
			if (local15.method3010()) {
				if (local15.method3009() == null) {
					local15.method6045();
					local15.method5714();
					this.anInt4745 += local15.anInt3289;
				}
			} else if ((long) 5 < ++local15.aLong211) {
				@Pc(60) Class1_Sub4_Sub8 local60 = Static181.aClass8_1.method913(local15);
				this.aClass38_28.method1472(local60, local15.aLong217);
				Static217.method4013(local15, local60);
				local15.method6045();
				local15.method5714();
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public void method4353() {
		for (@Pc(11) Class1_Sub4_Sub8 local11 = (Class1_Sub4_Sub8) this.aClass89_5.method2718(); local11 != null; local11 = (Class1_Sub4_Sub8) this.aClass89_5.method2726()) {
			if (local11.method3010()) {
				local11.method6045();
				local11.method5714();
				this.anInt4745 += local11.anInt3289;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)I")
	public int method4358() {
		return this.anInt4748;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!ur;ILjava/lang/Object;)V")
	private void method4359(@OriginalArg(1) Interface10 arg0, @OriginalArg(3) Object arg1) {
		if (this.anInt4748 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method4362(arg0);
		this.anInt4745--;
		while (this.anInt4745 < 0) {
			@Pc(36) Class1_Sub4_Sub8 local36 = (Class1_Sub4_Sub8) this.aClass89_5.method2722();
			this.method4360(local36);
		}
		@Pc(57) Class1_Sub4_Sub8_Sub2 local57 = new Class1_Sub4_Sub8_Sub2(arg0, arg1, 1);
		this.aClass38_28.method1472(local57, arg0.method4694());
		this.aClass89_5.method2720(local57);
		local57.aLong211 = 0L;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!ek;B)V")
	private void method4360(@OriginalArg(0) Class1_Sub4_Sub8 arg0) {
		if (arg0 != null) {
			arg0.method6045();
			arg0.method5714();
			this.anInt4745 += arg0.anInt3289;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BLclient!ur;)Ljava/lang/Object;")
	public Object method4361(@OriginalArg(1) Interface10 arg0) {
		@Pc(9) long local9 = arg0.method4694();
		for (@Pc(23) Class1_Sub4_Sub8 local23 = (Class1_Sub4_Sub8) this.aClass38_28.method1475(local9); local23 != null; local23 = (Class1_Sub4_Sub8) this.aClass38_28.method1477()) {
			if (local23.anInterface10_3.method4695(arg0)) {
				@Pc(35) Object local35 = local23.method3009();
				if (local35 != null) {
					if (local23.method3010()) {
						@Pc(74) Class1_Sub4_Sub8_Sub2 local74 = new Class1_Sub4_Sub8_Sub2(arg0, local35, local23.anInt3289);
						this.aClass38_28.method1472(local74, local23.aLong217);
						this.aClass89_5.method2720(local74);
						local74.aLong211 = 0L;
						local23.method6045();
						local23.method5714();
					} else {
						this.aClass89_5.method2720(local23);
						local23.aLong211 = 0L;
					}
					return local35;
				}
				local23.method6045();
				local23.method5714();
				this.anInt4745 += local23.anInt3289;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(BLclient!ur;)V")
	private void method4362(@OriginalArg(1) Interface10 arg0) {
		@Pc(9) long local9 = arg0.method4694();
		for (@Pc(16) Class1_Sub4_Sub8 local16 = (Class1_Sub4_Sub8) this.aClass38_28.method1475(local9); local16 != null; local16 = (Class1_Sub4_Sub8) this.aClass38_28.method1477()) {
			if (local16.anInterface10_3.method4695(arg0)) {
				this.method4360(local16);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)I")
	public int method4363() {
		return this.anInt4745;
	}
}
