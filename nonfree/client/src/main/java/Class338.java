import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public final class Class338 {

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
	public int anInt9727;

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "Lclient!of;")
	private final Class236 aClass236_94 = new Class236(64);

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!of;")
	public final Class236 aClass236_95 = new Class236(50);

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "Lclient!of;")
	public final Class236 aClass236_96 = new Class236(5);

	@OriginalMember(owner = "client!uc", name = "i", descriptor = "Lclient!oh;")
	private final Class237 aClass237_136;

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "Lclient!oh;")
	public final Class237 aClass237_135;

	@OriginalMember(owner = "client!uc", name = "n", descriptor = "Z")
	public boolean aBoolean690;

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "Lclient!nb;")
	public final Class217 aClass217_6;

	@OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lclient!nb;IZLclient!oh;Lclient!oh;)V")
	public Class338(@OriginalArg(0) Class217 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class237 arg3, @OriginalArg(4) Class237 arg4) {
		this.aClass237_136 = arg3;
		this.aClass237_135 = arg4;
		this.aBoolean690 = arg2;
		this.aClass217_6 = arg0;
		if (this.aClass237_136 != null) {
			@Pc(41) int local41 = this.aClass237_136.method6311() - 1;
			this.aClass237_136.method6315(local41);
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)Lclient!saa;")
	public Class300 method7851(@OriginalArg(1) int arg0) {
		@Pc(11) Class236 local11 = this.aClass236_94;
		@Pc(21) Class300 local21;
		synchronized (this.aClass236_94) {
			local21 = (Class300) this.aClass236_94.method6242((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(34) Class237 local34 = this.aClass237_136;
		@Pc(47) byte[] local47;
		synchronized (this.aClass237_136) {
			local47 = this.aClass237_136.method6314(Static86.method2110(arg0), Static262.method4602(arg0));
		}
		local21 = new Class300();
		local21.aClass338_2 = this;
		local21.anInt8898 = arg0;
		if (local47 != null) {
			local21.method7318(new Class8_Sub8(local47));
		}
		local21.method7308();
		@Pc(78) Class236 local78 = this.aClass236_94;
		synchronized (this.aClass236_94) {
			this.aClass236_94.method6241((long) arg0, local21);
			return local21;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)V")
	public void method7852() {
		@Pc(2) Class236 local2 = this.aClass236_95;
		synchronized (this.aClass236_95) {
			this.aClass236_95.method6253();
		}
		local2 = this.aClass236_96;
		synchronized (this.aClass236_96) {
			this.aClass236_96.method6253();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IB)V")
	public void method7853(@OriginalArg(0) int arg0) {
		this.anInt9727 = arg0;
		@Pc(15) Class236 local15 = this.aClass236_95;
		synchronized (this.aClass236_95) {
			this.aClass236_95.method6253();
		}
		local15 = this.aClass236_96;
		synchronized (this.aClass236_96) {
			this.aClass236_96.method6253();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZB)V")
	public void method7854(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean690) {
			this.aBoolean690 = arg0;
			this.method7857();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public void method7855() {
		@Pc(6) Class236 local6 = this.aClass236_94;
		synchronized (this.aClass236_94) {
			this.aClass236_94.method6245();
		}
		local6 = this.aClass236_95;
		synchronized (this.aClass236_95) {
			this.aClass236_95.method6245();
		}
		local6 = this.aClass236_96;
		synchronized (this.aClass236_96) {
			this.aClass236_96.method6245();
		}
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)V")
	public void method7856() {
		@Pc(14) Class236 local14 = this.aClass236_94;
		synchronized (this.aClass236_94) {
			this.aClass236_94.method6243(5);
		}
		local14 = this.aClass236_95;
		synchronized (this.aClass236_95) {
			this.aClass236_95.method6243(5);
		}
		local14 = this.aClass236_96;
		synchronized (this.aClass236_96) {
			this.aClass236_96.method6243(5);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public void method7857() {
		@Pc(14) Class236 local14 = this.aClass236_94;
		synchronized (this.aClass236_94) {
			this.aClass236_94.method6253();
		}
		local14 = this.aClass236_95;
		synchronized (this.aClass236_95) {
			this.aClass236_95.method6253();
		}
		local14 = this.aClass236_96;
		synchronized (this.aClass236_96) {
			this.aClass236_96.method6253();
		}
	}
}
