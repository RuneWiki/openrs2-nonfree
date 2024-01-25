import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class234 {

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "I")
	public int anInt6543;

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!uf;")
	private final Class326 aClass326_33 = new Class326(64);

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!uf;")
	public final Class326 aClass326_34 = new Class326(50);

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!ur;")
	public final Class334 aClass334_1 = new Class334(250);

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "Lclient!sp;")
	private final Class300 aClass300_1 = new Class300();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
	public final int anInt6528;

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!ga;")
	public final Class111 aClass111_88;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!ka;")
	private final Class183 aClass183_2;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!ga;")
	private final Class111 aClass111_89;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Z")
	private boolean aBoolean464;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
	public final int anInt6530;

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray28;

	@OriginalMember(owner = "client!oa", name = "A", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray29;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!nq;IZLclient!ka;Lclient!ga;Lclient!ga;)V")
	public Class234(@OriginalArg(0) Class230 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class183 arg3, @OriginalArg(4) Class111 arg4, @OriginalArg(5) Class111 arg5) {
		this.anInt6528 = arg1;
		this.aClass111_88 = arg5;
		this.aClass183_2 = arg3;
		this.aClass111_89 = arg4;
		this.aBoolean464 = arg2;
		if (this.aClass111_89 == null) {
			this.anInt6530 = 0;
		} else {
			@Pc(54) int local54 = this.aClass111_89.method2436() - 1;
			this.anInt6530 = this.aClass111_89.method2442(local54) + local54 * 256;
		}
		this.aStringArray28 = new String[] { null, null, Static103.aClass77_9.method1864(this.anInt6528), null, null };
		this.aStringArray29 = new String[] { null, null, null, null, Static103.aClass77_10.method1864(this.anInt6528) };
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lclient!tw;")
	public Class322 method5390(@OriginalArg(1) int arg0) {
		@Pc(8) Class326 local8 = this.aClass326_33;
		@Pc(18) Class322 local18;
		synchronized (this.aClass326_33) {
			local18 = (Class322) this.aClass326_33.method7238((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class111 local31 = this.aClass111_89;
		@Pc(44) byte[] local44;
		synchronized (this.aClass111_89) {
			local44 = this.aClass111_89.method2441(Static402.method5683(arg0), Static360.method5256(arg0));
		}
		local18 = new Class322();
		local18.aClass234_2 = this;
		local18.anInt8624 = arg0;
		local18.aStringArray37 = new String[] { null, null, Static103.aClass77_9.method1864(this.anInt6528), null, null };
		local18.aStringArray38 = new String[] { null, null, null, null, Static103.aClass77_10.method1864(this.anInt6528) };
		if (local44 != null) {
			local18.method7108(new Class1_Sub20(local44));
		}
		local18.method7124();
		if (local18.anInt8591 != -1) {
			local18.method7112(this.method5390(local18.anInt8637), this.method5390(local18.anInt8591));
		}
		if (local18.anInt8603 != -1) {
			local18.method7123(this.method5390(local18.anInt8626), this.method5390(local18.anInt8603));
		}
		if (!this.aBoolean464 && local18.aBoolean630) {
			local18.aString89 = Static103.aClass77_7.method1864(this.anInt6528);
			local18.anIntArray592 = null;
			local18.aStringArray38 = this.aStringArray29;
			local18.aStringArray37 = this.aStringArray28;
			local18.aBoolean631 = false;
			local18.anInt8604 = 0;
			if (local18.aClass356_38 != null) {
				@Pc(204) boolean local204 = false;
				for (@Pc(209) Class1 local209 = local18.aClass356_38.method7792(); local209 != null; local209 = local18.aClass356_38.method7795()) {
					@Pc(219) Class105 local219 = this.aClass183_2.method4071((int) local209.aLong425);
					if (local219.aBoolean201) {
						local209.method7878();
					} else {
						local204 = true;
					}
				}
				if (!local204) {
					local18.aClass356_38 = null;
				}
			}
		}
		@Pc(244) Class326 local244 = this.aClass326_33;
		synchronized (this.aClass326_33) {
			this.aClass326_33.method7236(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public void method5391() {
		@Pc(6) Class326 local6 = this.aClass326_33;
		synchronized (this.aClass326_33) {
			this.aClass326_33.method7230();
		}
		local6 = this.aClass326_34;
		synchronized (this.aClass326_34) {
			this.aClass326_34.method7230();
		}
		@Pc(42) Class334 local42 = this.aClass334_1;
		synchronized (this.aClass334_1) {
			this.aClass334_1.method7347();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)V")
	public void method5392(@OriginalArg(0) int arg0) {
		this.anInt6543 = arg0;
		@Pc(27) Class326 local27 = this.aClass326_34;
		synchronized (this.aClass326_34) {
			this.aClass326_34.method7230();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public void method5393() {
		@Pc(2) Class326 local2 = this.aClass326_34;
		synchronized (this.aClass326_34) {
			this.aClass326_34.method7230();
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)V")
	public void method5395() {
		@Pc(6) Class326 local6 = this.aClass326_33;
		synchronized (this.aClass326_33) {
			this.aClass326_33.method7241(5);
		}
		local6 = this.aClass326_34;
		synchronized (this.aClass326_34) {
			this.aClass326_34.method7241(5);
		}
		@Pc(38) Class334 local38 = this.aClass334_1;
		synchronized (this.aClass334_1) {
			this.aClass334_1.method7346();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!bl;Lclient!r;ZZIBIILclient!r;Lclient!la;)Lclient!f;")
	public Class10 method5397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class12 arg9, @OriginalArg(11) Class35 arg10) {
		@Pc(22) Class10 local22 = this.method5398(arg0, arg8, arg1, arg3, arg7, arg6, arg2);
		if (local22 != null) {
			return local22;
		}
		@Pc(31) Class322 local31 = this.method5390(arg0);
		if (arg1 > 1 && local31.anIntArray591 != null) {
			@Pc(41) int local41 = -1;
			for (@Pc(43) int local43 = 0; local43 < 10; local43++) {
				if (arg1 >= local31.anIntArray590[local43] && local31.anIntArray590[local43] != 0) {
					local41 = local31.anIntArray591[local43];
				}
			}
			if (local41 != -1) {
				local31 = this.method5390(local41);
			}
		}
		@Pc(88) int[] local88 = local31.method7115(arg6, arg1, arg8, arg3, arg4, arg9, arg7, arg10, arg2);
		if (local88 == null) {
			return null;
		}
		@Pc(102) Class10 local102;
		if (arg5) {
			local102 = arg9.method6429(local88, 36, 36, 32);
		} else {
			local102 = arg3.method6429(local88, 36, 36, 32);
		}
		if (!arg5) {
			@Pc(118) Class300 local118 = new Class300();
			local118.anInt8248 = arg0;
			local118.anInt8252 = arg8;
			local118.anInt8254 = arg7;
			local118.anInt8253 = arg3.anInt7780;
			local118.anInt8250 = arg1;
			local118.anInt8247 = arg6;
			local118.aBoolean595 = arg2 != null;
			this.aClass334_1.method7341(local102, local118);
		}
		return local102;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILclient!r;IBILclient!bl;)Lclient!f;")
	public Class10 method5398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class34 arg6) {
		this.aClass300_1.anInt8247 = arg5;
		this.aClass300_1.anInt8248 = arg0;
		this.aClass300_1.anInt8250 = arg2;
		this.aClass300_1.anInt8252 = arg1;
		this.aClass300_1.anInt8253 = arg3.anInt7780;
		this.aClass300_1.aBoolean595 = arg6 != null;
		this.aClass300_1.anInt8254 = arg4;
		return (Class10) this.aClass334_1.method7340(this.aClass300_1);
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public void method5399() {
		@Pc(6) Class334 local6 = this.aClass334_1;
		synchronized (this.aClass334_1) {
			this.aClass334_1.method7347();
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	public void method5400() {
		@Pc(2) Class326 local2 = this.aClass326_33;
		synchronized (this.aClass326_33) {
			this.aClass326_33.method7234();
		}
		local2 = this.aClass326_34;
		synchronized (this.aClass326_34) {
			this.aClass326_34.method7234();
		}
		@Pc(50) Class334 local50 = this.aClass334_1;
		synchronized (this.aClass334_1) {
			this.aClass334_1.method7338();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)V")
	public void method5401(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean464 != arg0) {
			this.aBoolean464 = arg0;
			this.method5391();
		}
	}
}
