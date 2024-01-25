import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class114 {

	@OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
	public int anInt2783;

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!mf;")
	private final Class222 aClass222_16 = new Class222(64);

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!mf;")
	public final Class222 aClass222_17 = new Class222(50);

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "Lclient!ol;")
	public final Class250 aClass250_1 = new Class250(250);

	@OriginalMember(owner = "client!ga", name = "w", descriptor = "Lclient!qfa;")
	private final Class275 aClass275_1 = new Class275();

	@OriginalMember(owner = "client!ga", name = "A", descriptor = "Lclient!bs;")
	private final Class38 aClass38_1;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "Lclient!pu;")
	private final Class270 aClass270_32;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "I")
	public final int anInt2781;

	@OriginalMember(owner = "client!ga", name = "h", descriptor = "Z")
	private boolean aBoolean208;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!pu;")
	public final Class270 aClass270_33;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "I")
	public final int anInt2779;

	@OriginalMember(owner = "client!ga", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray15;

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray16;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!kr;IZLclient!bs;Lclient!pu;Lclient!pu;)V")
	public Class114(@OriginalArg(0) Class195 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class38 arg3, @OriginalArg(4) Class270 arg4, @OriginalArg(5) Class270 arg5) {
		this.aClass38_1 = arg3;
		this.aClass270_32 = arg4;
		this.anInt2781 = arg1;
		this.aBoolean208 = arg2;
		this.aClass270_33 = arg5;
		if (this.aClass270_32 == null) {
			this.anInt2779 = 0;
		} else {
			@Pc(54) int local54 = this.aClass270_32.method5674() - 1;
			this.anInt2779 = this.aClass270_32.method5685(local54) + local54 * 256;
		}
		this.aStringArray15 = new String[] { null, null, Static568.aClass351_11.method7651(this.anInt2781), null, null };
		this.aStringArray16 = new String[] { null, null, null, null, Static568.aClass351_12.method7651(this.anInt2781) };
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!kga;ZIILclient!r;BLclient!r;Lclient!la;IIZ)Lclient!f;")
	public Class22 method2209(@OriginalArg(0) int arg0, @OriginalArg(1) Class190 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class134 arg5, @OriginalArg(7) Class134 arg6, @OriginalArg(8) Class64 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(16) Class22 local16 = this.method2216(arg0, arg4, arg3, arg8, arg9, arg6, arg1);
		if (local16 != null) {
			return local16;
		}
		@Pc(25) Class245 local25 = this.method2217(arg9);
		if (arg3 > 1 && local25.anIntArray502 != null) {
			@Pc(33) int local33 = -1;
			for (@Pc(35) int local35 = 0; local35 < 10; local35++) {
				if (arg3 >= local25.anIntArray501[local35] && local25.anIntArray501[local35] != 0) {
					local33 = local25.anIntArray502[local35];
				}
			}
			if (local33 != -1) {
				local25 = this.method2217(local33);
			}
		}
		@Pc(88) int[] local88 = local25.method4997(arg0, arg1, arg2, arg4, arg7, arg3, arg5, arg6, arg8);
		if (local88 == null) {
			return null;
		}
		@Pc(110) Class22 local110;
		if (arg10) {
			local110 = arg5.method6970(local88, 36, 36, 32);
		} else {
			local110 = arg6.method6970(local88, 36, 36, 32);
		}
		if (!arg10) {
			@Pc(126) Class275 local126 = new Class275();
			local126.anInt7464 = arg9;
			local126.anInt7469 = arg4;
			local126.anInt7465 = arg3;
			local126.anInt7471 = arg0;
			local126.anInt7463 = arg6.anInt8508;
			local126.anInt7466 = arg8;
			local126.aBoolean584 = arg1 != null;
			this.aClass250_1.method5287(local110, local126);
		}
		return local110;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V")
	public void method2210() {
		@Pc(12) Class222 local12 = this.aClass222_16;
		synchronized (this.aClass222_16) {
			this.aClass222_16.method4433(5);
		}
		local12 = this.aClass222_17;
		synchronized (this.aClass222_17) {
			this.aClass222_17.method4433(5);
		}
		@Pc(44) Class250 local44 = this.aClass250_1;
		synchronized (this.aClass250_1) {
			this.aClass250_1.method5279();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
	public void method2211() {
		@Pc(2) Class222 local2 = this.aClass222_16;
		synchronized (this.aClass222_16) {
			this.aClass222_16.method4422();
		}
		local2 = this.aClass222_17;
		synchronized (this.aClass222_17) {
			this.aClass222_17.method4422();
		}
		@Pc(36) Class250 local36 = this.aClass250_1;
		synchronized (this.aClass250_1) {
			this.aClass250_1.method5277();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)V")
	public void method2212(@OriginalArg(1) int arg0) {
		this.anInt2783 = arg0;
		@Pc(14) Class222 local14 = this.aClass222_17;
		synchronized (this.aClass222_17) {
			this.aClass222_17.method4428();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZ)V")
	public void method2213(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean208) {
			this.aBoolean208 = arg0;
			this.method2214();
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public void method2214() {
		@Pc(2) Class222 local2 = this.aClass222_16;
		synchronized (this.aClass222_16) {
			this.aClass222_16.method4428();
		}
		@Pc(29) Class222 local29 = this.aClass222_17;
		synchronized (this.aClass222_17) {
			this.aClass222_17.method4428();
		}
		@Pc(44) Class250 local44 = this.aClass250_1;
		synchronized (this.aClass250_1) {
			this.aClass250_1.method5281();
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
	public void method2215() {
		@Pc(12) Class222 local12 = this.aClass222_17;
		synchronized (this.aClass222_17) {
			this.aClass222_17.method4428();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIIIILclient!r;Lclient!kga;I)Lclient!f;")
	public Class22 method2216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class134 arg5, @OriginalArg(6) Class190 arg6) {
		this.aClass275_1.anInt7465 = arg2;
		this.aClass275_1.anInt7463 = arg5.anInt8508;
		this.aClass275_1.anInt7471 = arg0;
		this.aClass275_1.aBoolean584 = arg6 != null;
		this.aClass275_1.anInt7464 = arg4;
		this.aClass275_1.anInt7466 = arg3;
		this.aClass275_1.anInt7469 = arg1;
		return (Class22) this.aClass250_1.method5282(this.aClass275_1);
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Lclient!oc;")
	public Class245 method2217(@OriginalArg(0) int arg0) {
		@Pc(8) Class222 local8 = this.aClass222_16;
		@Pc(18) Class245 local18;
		synchronized (this.aClass222_16) {
			local18 = (Class245) this.aClass222_16.method4430((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(31) Class270 local31 = this.aClass270_32;
		@Pc(44) byte[] local44;
		synchronized (this.aClass270_32) {
			local44 = this.aClass270_32.method5704(Static88.method1541(arg0), Static138.method2102(arg0));
		}
		local18 = new Class245();
		local18.anInt6203 = arg0;
		local18.aClass114_2 = this;
		local18.aStringArray27 = new String[] { null, null, Static568.aClass351_11.method7651(this.anInt2781), null, null };
		local18.aStringArray28 = new String[] { null, null, null, null, Static568.aClass351_12.method7651(this.anInt2781) };
		if (local44 != null) {
			local18.method5008(new Class1_Sub35(local44));
		}
		local18.method5011();
		if (local18.anInt6232 != -1) {
			local18.method5009(this.method2217(local18.anInt6232), this.method2217(local18.anInt6184));
		}
		if (local18.anInt6188 != -1) {
			local18.method5003(this.method2217(local18.anInt6188), this.method2217(local18.anInt6235));
		}
		if (!this.aBoolean208 && local18.aBoolean490) {
			local18.aString62 = Static568.aClass351_9.method7651(this.anInt2781);
			local18.aStringArray28 = this.aStringArray16;
			local18.anIntArray503 = null;
			local18.anInt6181 = 0;
			local18.aStringArray27 = this.aStringArray15;
			local18.aBoolean489 = false;
			if (local18.aClass187_26 != null) {
				@Pc(201) boolean local201 = false;
				for (@Pc(206) Class1 local206 = local18.aClass187_26.method3799(); local206 != null; local206 = local18.aClass187_26.method3805()) {
					@Pc(216) Class120 local216 = this.aClass38_1.method713((int) local206.aLong301);
					if (local216.aBoolean225) {
						local206.method7859();
					} else {
						local201 = true;
					}
				}
				if (!local201) {
					local18.aClass187_26 = null;
				}
			}
		}
		@Pc(243) Class222 local243 = this.aClass222_16;
		synchronized (this.aClass222_16) {
			this.aClass222_16.method4434(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
	public void method2218() {
		@Pc(6) Class250 local6 = this.aClass250_1;
		synchronized (this.aClass250_1) {
			this.aClass250_1.method5281();
		}
	}
}
