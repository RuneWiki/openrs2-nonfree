import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gia")
public final class Class121 {

	@OriginalMember(owner = "client!gia", name = "u", descriptor = "I")
	public int anInt3177;

	@OriginalMember(owner = "client!gia", name = "o", descriptor = "Lclient!af;")
	private final Class10 aClass10_14 = new Class10(64);

	@OriginalMember(owner = "client!gia", name = "r", descriptor = "Lclient!af;")
	public final Class10 aClass10_15 = new Class10(50);

	@OriginalMember(owner = "client!gia", name = "s", descriptor = "Lclient!mga;")
	public final Class223 aClass223_1 = new Class223(250);

	@OriginalMember(owner = "client!gia", name = "t", descriptor = "Lclient!pg;")
	private final Class272 aClass272_1 = new Class272();

	@OriginalMember(owner = "client!gia", name = "h", descriptor = "Z")
	private boolean aBoolean192;

	@OriginalMember(owner = "client!gia", name = "e", descriptor = "Lclient!ae;")
	private final Class8 aClass8_54;

	@OriginalMember(owner = "client!gia", name = "k", descriptor = "Lclient!ae;")
	public final Class8 aClass8_55;

	@OriginalMember(owner = "client!gia", name = "p", descriptor = "I")
	public final int anInt3175;

	@OriginalMember(owner = "client!gia", name = "w", descriptor = "Lclient!ud;")
	private final Class349 aClass349_1;

	@OriginalMember(owner = "client!gia", name = "m", descriptor = "I")
	public final int anInt3173;

	@OriginalMember(owner = "client!gia", name = "x", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray21;

	@OriginalMember(owner = "client!gia", name = "v", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray20;

	@OriginalMember(owner = "client!gia", name = "<init>", descriptor = "(Lclient!jk;IZLclient!ud;Lclient!ae;Lclient!ae;)V")
	public Class121(@OriginalArg(0) Class176 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class349 arg3, @OriginalArg(4) Class8 arg4, @OriginalArg(5) Class8 arg5) {
		this.aBoolean192 = arg2;
		this.aClass8_54 = arg4;
		this.aClass8_55 = arg5;
		this.anInt3175 = arg1;
		this.aClass349_1 = arg3;
		if (this.aClass8_54 == null) {
			this.anInt3173 = 0;
		} else {
			@Pc(54) int local54 = this.aClass8_54.method279() - 1;
			this.anInt3173 = this.aClass8_54.method280(local54) + local54 * 256;
		}
		this.aStringArray21 = new String[] { null, null, Static52.aClass41_8.method1007(this.anInt3175), null, null };
		this.aStringArray20 = new String[] { null, null, null, null, Static52.aClass41_9.method1007(this.anInt3175) };
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(I)V")
	public void method2641() {
		@Pc(6) Class223 local6 = this.aClass223_1;
		synchronized (this.aClass223_1) {
			this.aClass223_1.method5302();
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ZI)V")
	public void method2642(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean192) {
			this.aBoolean192 = arg0;
			this.method2645();
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(II)V")
	public void method2643() {
		@Pc(2) Class10 local2 = this.aClass10_14;
		synchronized (this.aClass10_14) {
			this.aClass10_14.method369(5);
		}
		local2 = this.aClass10_15;
		synchronized (this.aClass10_15) {
			this.aClass10_15.method369(5);
		}
		@Pc(48) Class223 local48 = this.aClass223_1;
		synchronized (this.aClass223_1) {
			this.aClass223_1.method5305();
		}
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(I)V")
	public void method2644() {
		@Pc(2) Class10 local2 = this.aClass10_15;
		synchronized (this.aClass10_15) {
			this.aClass10_15.method375();
		}
	}

	@OriginalMember(owner = "client!gia", name = "c", descriptor = "(I)V")
	public void method2645() {
		@Pc(6) Class10 local6 = this.aClass10_14;
		synchronized (this.aClass10_14) {
			this.aClass10_14.method375();
		}
		local6 = this.aClass10_15;
		synchronized (this.aClass10_15) {
			this.aClass10_15.method375();
		}
		@Pc(36) Class223 local36 = this.aClass223_1;
		synchronized (this.aClass223_1) {
			this.aClass223_1.method5302();
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILclient!pfa;IIIILclient!ha;I)Lclient!ho;")
	public Class9 method2646(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class132 arg6) {
		this.aClass272_1.anInt7509 = arg3;
		this.aClass272_1.aBoolean503 = arg1 != null;
		this.aClass272_1.anInt7501 = arg2;
		this.aClass272_1.anInt7507 = arg5;
		this.aClass272_1.anInt7500 = arg0;
		this.aClass272_1.anInt7504 = arg6.anInt8773;
		this.aClass272_1.anInt7508 = arg4;
		return (Class9) this.aClass223_1.method5309(this.aClass272_1);
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(BI)Lclient!lv;")
	public Class216 method2647(@OriginalArg(1) int arg0) {
		@Pc(14) Class10 local14 = this.aClass10_14;
		@Pc(24) Class216 local24;
		synchronized (this.aClass10_14) {
			local24 = (Class216) this.aClass10_14.method373((long) arg0);
		}
		if (local24 != null) {
			return local24;
		}
		@Pc(37) Class8 local37 = this.aClass8_54;
		@Pc(50) byte[] local50;
		synchronized (this.aClass8_54) {
			local50 = this.aClass8_54.method262(Static443.method6465(arg0), Static307.method4408(arg0));
		}
		local24 = new Class216();
		local24.aClass121_2 = this;
		local24.anInt6067 = arg0;
		local24.aStringArray44 = new String[] { null, null, Static52.aClass41_8.method1007(this.anInt3175), null, null };
		local24.aStringArray45 = new String[] { null, null, null, null, Static52.aClass41_9.method1007(this.anInt3175) };
		if (local50 != null) {
			local24.method5160(new Class6_Sub23(local50));
		}
		local24.method5159();
		if (local24.anInt6088 != -1) {
			local24.method5150(this.method2647(local24.anInt6088), this.method2647(local24.anInt6046));
		}
		if (local24.anInt6049 != -1) {
			local24.method5152(this.method2647(local24.anInt6056), this.method2647(local24.anInt6049));
		}
		if (local24.anInt6087 != -1) {
			local24.method5147(this.method2647(local24.anInt6087), this.method2647(local24.anInt6103));
		}
		if (!this.aBoolean192 && local24.aBoolean401) {
			local24.aString77 = Static52.aClass41_5.method1007(this.anInt3175);
			local24.anInt6066 = 0;
			local24.aBoolean400 = false;
			local24.aStringArray44 = this.aStringArray21;
			local24.aStringArray45 = this.aStringArray20;
			local24.anIntArray357 = null;
			if (local24.aClass209_34 != null) {
				@Pc(222) boolean local222 = false;
				for (@Pc(229) Class6 local229 = local24.aClass209_34.method5037(); local229 != null; local229 = local24.aClass209_34.method5036()) {
					@Pc(239) Class325 local239 = this.aClass349_1.method8157((int) local229.aLong314);
					if (local239.aBoolean674) {
						local229.method9174();
					} else {
						local222 = true;
					}
				}
				if (!local222) {
					local24.aClass209_34 = null;
				}
			}
		}
		@Pc(264) Class10 local264 = this.aClass10_14;
		synchronized (this.aClass10_14) {
			this.aClass10_14.method366(local24, (long) arg0);
			return local24;
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(Lclient!ha;ZIBIILclient!ha;ZLclient!da;Lclient!pfa;II)Lclient!ho;")
	public Class9 method2649(@OriginalArg(0) Class132 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class132 arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) Class19 arg7, @OriginalArg(9) Class271 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(16) Class9 local16 = this.method2646(arg2, arg8, arg10, arg3, arg4, arg9, arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(31) Class216 local31 = this.method2647(arg10);
		if (arg3 > 1 && local31.anIntArray359 != null) {
			@Pc(39) int local39 = -1;
			for (@Pc(41) int local41 = 0; local41 < 10; local41++) {
				if (arg3 >= local31.anIntArray358[local41] && local31.anIntArray358[local41] != 0) {
					local39 = local31.anIntArray359[local41];
				}
			}
			if (local39 != -1) {
				local31 = this.method2647(local39);
			}
		}
		@Pc(94) int[] local94 = local31.method5146(arg5, arg2, arg7, arg8, arg0, arg4, arg9, arg3, arg1);
		if (local94 == null) {
			return null;
		}
		@Pc(109) Class9 local109;
		if (arg6) {
			local109 = arg5.method7444(local94, 36, 32, 36);
		} else {
			local109 = arg0.method7444(local94, 36, 32, 36);
		}
		if (!arg6) {
			@Pc(126) Class272 local126 = new Class272();
			local126.anInt7509 = arg3;
			local126.anInt7501 = arg10;
			local126.anInt7508 = arg4;
			local126.anInt7507 = arg9;
			local126.anInt7504 = arg0.anInt8773;
			local126.aBoolean503 = arg8 != null;
			local126.anInt7500 = arg2;
			this.aClass223_1.method5300(local109, local126);
		}
		return local109;
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(B)V")
	public void method2650() {
		@Pc(2) Class10 local2 = this.aClass10_14;
		synchronized (this.aClass10_14) {
			this.aClass10_14.method380();
		}
		local2 = this.aClass10_15;
		synchronized (this.aClass10_15) {
			this.aClass10_15.method380();
		}
		@Pc(42) Class223 local42 = this.aClass223_1;
		synchronized (this.aClass223_1) {
			this.aClass223_1.method5303();
		}
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(II)V")
	public void method2651(@OriginalArg(1) int arg0) {
		this.anInt3177 = arg0;
		@Pc(17) Class10 local17 = this.aClass10_15;
		synchronized (this.aClass10_15) {
			this.aClass10_15.method375();
		}
	}
}
