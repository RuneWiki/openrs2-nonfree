import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mp")
public final class Class225 {

	@OriginalMember(owner = "client!mp", name = "y", descriptor = "I")
	public int anInt6015;

	@OriginalMember(owner = "client!mp", name = "l", descriptor = "Lclient!lga;")
	private final Class207 aClass207_32 = new Class207(64);

	@OriginalMember(owner = "client!mp", name = "v", descriptor = "Lclient!lga;")
	public final Class207 aClass207_33 = new Class207(50);

	@OriginalMember(owner = "client!mp", name = "w", descriptor = "Lclient!dj;")
	public final Class63 aClass63_1 = new Class63(250);

	@OriginalMember(owner = "client!mp", name = "x", descriptor = "Lclient!rb;")
	private final Class290 aClass290_1 = new Class290();

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
	public final int anInt6002;

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "Lclient!sea;")
	public final Class308 aClass308_116;

	@OriginalMember(owner = "client!mp", name = "o", descriptor = "Z")
	private boolean aBoolean465;

	@OriginalMember(owner = "client!mp", name = "j", descriptor = "Lclient!sea;")
	private final Class308 aClass308_117;

	@OriginalMember(owner = "client!mp", name = "z", descriptor = "Lclient!pa;")
	private final Class263 aClass263_2;

	@OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
	public final int anInt6004;

	@OriginalMember(owner = "client!mp", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray21;

	@OriginalMember(owner = "client!mp", name = "B", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray22;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!ci;IZLclient!pa;Lclient!sea;Lclient!sea;)V")
	public Class225(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class263 arg3, @OriginalArg(4) Class308 arg4, @OriginalArg(5) Class308 arg5) {
		this.anInt6002 = arg1;
		this.aClass308_116 = arg5;
		this.aBoolean465 = arg2;
		this.aClass308_117 = arg4;
		this.aClass263_2 = arg3;
		if (this.aClass308_117 == null) {
			this.anInt6004 = 0;
		} else {
			@Pc(54) int local54 = this.aClass308_117.method6564() - 1;
			this.anInt6004 = local54 * 256 + this.aClass308_117.method6568(local54);
		}
		this.aStringArray21 = new String[] { null, null, Static375.aClass253_11.method5453(this.anInt6002), null, null };
		this.aStringArray22 = new String[] { null, null, null, null, Static375.aClass253_12.method5453(this.anInt6002) };
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)Lclient!mga;")
	public Class222 method4857(@OriginalArg(1) int arg0) {
		@Pc(8) Class207 local8 = this.aClass207_32;
		@Pc(18) Class222 local18;
		synchronized (this.aClass207_32) {
			local18 = (Class222) this.aClass207_32.method4390((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class308 local31 = this.aClass308_117;
		@Pc(44) byte[] local44;
		synchronized (this.aClass308_117) {
			local44 = this.aClass308_117.method6569(Static535.method5759(arg0), Static32.method601(arg0));
		}
		local18 = new Class222();
		local18.aClass225_2 = this;
		local18.anInt5882 = arg0;
		local18.aStringArray20 = new String[] { null, null, Static375.aClass253_11.method5453(this.anInt6002), null, null };
		local18.aStringArray19 = new String[] { null, null, null, null, Static375.aClass253_12.method5453(this.anInt6002) };
		if (local44 != null) {
			local18.method4779(new Class1_Sub3(local44));
		}
		local18.method4780();
		if (local18.anInt5866 != -1) {
			local18.method4777(this.method4857(local18.anInt5866), this.method4857(local18.anInt5871));
		}
		if (local18.anInt5898 != -1) {
			local18.method4781(this.method4857(local18.anInt5880), this.method4857(local18.anInt5898));
		}
		if (!this.aBoolean465 && local18.aBoolean464) {
			local18.aString70 = Static375.aClass253_9.method5453(this.anInt6002);
			local18.aBoolean463 = false;
			local18.aStringArray19 = this.aStringArray22;
			local18.aStringArray20 = this.aStringArray21;
			local18.anIntArray352 = null;
			local18.anInt5870 = 0;
			if (local18.aClass91_26 != null) {
				@Pc(200) boolean local200 = false;
				for (@Pc(205) Class1 local205 = local18.aClass91_26.method2278(); local205 != null; local205 = local18.aClass91_26.method2276()) {
					@Pc(215) Class94 local215 = this.aClass263_2.method5592((int) local205.aLong268);
					if (local215.aBoolean201) {
						local205.method7908();
					} else {
						local200 = true;
					}
				}
				if (!local200) {
					local18.aClass91_26 = null;
				}
			}
		}
		@Pc(242) Class207 local242 = this.aClass207_32;
		synchronized (this.aClass207_32) {
			this.aClass207_32.method4391((long) arg0, local18);
			return local18;
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V")
	public void method4858() {
		@Pc(8) Class207 local8 = this.aClass207_33;
		synchronized (this.aClass207_33) {
			this.aClass207_33.method4392();
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)V")
	public void method4859(@OriginalArg(1) int arg0) {
		this.anInt6015 = arg0;
		@Pc(13) Class207 local13 = this.aClass207_33;
		synchronized (this.aClass207_33) {
			this.aClass207_33.method4392();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
	public void method4860() {
		@Pc(2) Class207 local2 = this.aClass207_32;
		synchronized (this.aClass207_32) {
			this.aClass207_32.method4392();
		}
		local2 = this.aClass207_33;
		synchronized (this.aClass207_33) {
			this.aClass207_33.method4392();
		}
		@Pc(36) Class63 local36 = this.aClass63_1;
		synchronized (this.aClass63_1) {
			this.aClass63_1.method1415();
		}
	}

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
	public void method4861() {
		@Pc(2) Class63 local2 = this.aClass63_1;
		synchronized (this.aClass63_1) {
			this.aClass63_1.method1415();
		}
	}

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V")
	public void method4863() {
		@Pc(12) Class207 local12 = this.aClass207_32;
		synchronized (this.aClass207_32) {
			this.aClass207_32.method4398();
		}
		local12 = this.aClass207_33;
		synchronized (this.aClass207_33) {
			this.aClass207_33.method4398();
		}
		@Pc(42) Class63 local42 = this.aClass63_1;
		synchronized (this.aClass63_1) {
			this.aClass63_1.method1407();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZIIZILclient!qi;Lclient!r;Lclient!la;ILclient!r;I)Lclient!f;")
	public Class5 method4864(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class283 arg5, @OriginalArg(7) Class78 arg6, @OriginalArg(8) Class96 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class78 arg9, @OriginalArg(11) int arg10) {
		@Pc(21) Class5 local21 = this.method4868(arg2, arg4, arg8, arg10, arg6, arg5, arg0);
		if (local21 != null) {
			return local21;
		}
		@Pc(30) Class222 local30 = this.method4857(arg10);
		if (arg2 > 1 && local30.anIntArray353 != null) {
			@Pc(40) int local40 = -1;
			for (@Pc(42) int local42 = 0; local42 < 10; local42++) {
				if (arg2 >= local30.anIntArray351[local42] && local30.anIntArray351[local42] != 0) {
					local40 = local30.anIntArray353[local42];
				}
			}
			if (local40 != -1) {
				local30 = this.method4857(local40);
			}
		}
		@Pc(94) int[] local94 = local30.method4785(arg4, arg7, arg5, arg2, arg9, arg1, arg0, arg6, arg8);
		if (local94 == null) {
			return null;
		}
		@Pc(108) Class5 local108;
		if (arg3) {
			local108 = arg9.method6842(local94, 36, 36, 32);
		} else {
			local108 = arg6.method6842(local94, 36, 36, 32);
		}
		if (!arg3) {
			@Pc(124) Class290 local124 = new Class290();
			local124.anInt7811 = arg8;
			local124.anInt7808 = arg10;
			local124.anInt7809 = arg6.anInt8385;
			local124.anInt7802 = arg2;
			local124.anInt7805 = arg0;
			local124.anInt7804 = arg4;
			local124.aBoolean589 = arg5 != null;
			this.aClass63_1.method1405(local108, local124);
		}
		return local108;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZI)V")
	public void method4866(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean465) {
			this.aBoolean465 = arg0;
			this.method4860();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BI)V")
	public void method4867() {
		@Pc(2) Class207 local2 = this.aClass207_32;
		synchronized (this.aClass207_32) {
			this.aClass207_32.method4397(5);
		}
		local2 = this.aClass207_33;
		synchronized (this.aClass207_33) {
			this.aClass207_33.method4397(5);
		}
		@Pc(38) Class63 local38 = this.aClass63_1;
		synchronized (this.aClass63_1) {
			this.aClass63_1.method1414();
		}
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IIIIILclient!r;Lclient!qi;I)Lclient!f;")
	public Class5 method4868(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class78 arg4, @OriginalArg(6) Class283 arg5, @OriginalArg(7) int arg6) {
		this.aClass290_1.anInt7809 = arg4.anInt8385;
		this.aClass290_1.anInt7808 = arg3;
		this.aClass290_1.anInt7804 = arg1;
		this.aClass290_1.anInt7811 = arg2;
		this.aClass290_1.aBoolean589 = arg5 != null;
		this.aClass290_1.anInt7802 = arg0;
		this.aClass290_1.anInt7805 = arg6;
		return (Class5) this.aClass63_1.method1408(this.aClass290_1);
	}
}
