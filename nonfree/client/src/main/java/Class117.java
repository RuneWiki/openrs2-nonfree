import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class117 {

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!ha;")
	private Class2 aClass2_20;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	private int anInt3098;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	private int anInt3100;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Z")
	private boolean aBoolean214 = true;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	private int anInt3096 = -1;

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "[Lclient!kv;")
	private final Class174[] aClass174Array2;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
	private final int anInt3087;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
	private final int anInt3094;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
	private final int anInt3089;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	private final int anInt3097;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "[Lclient!kv;")
	private final Class174[] aClass174Array1;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Lclient!kv;")
	private final Class174 aClass174_1;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(I[Lclient!kv;IIII)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) Class174[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass174Array2 = arg1;
		this.anInt3087 = arg5;
		this.anInt3094 = arg0;
		this.anInt3089 = arg4;
		this.anInt3097 = arg3;
		if (arg1 == null) {
			this.aClass174Array1 = null;
			this.aClass174_1 = null;
		} else {
			this.aClass174Array1 = new Class174[arg1.length];
			this.aClass174_1 = arg2 >= 0 ? arg1[arg2] : null;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public void method2618() {
		if (this.aClass174Array2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.aClass174Array2.length; local10++) {
				this.aClass174Array2[local10].method4377();
			}
		}
		this.aClass2_20 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!qa;)Z")
	public boolean method2620(@OriginalArg(1) int arg0, @OriginalArg(2) Class122 arg1) {
		if (this.anInt3096 != arg0) {
			this.anInt3096 = arg0;
			@Pc(12) int local12 = Static59.method1111(arg0);
			if (local12 > 512) {
				local12 = 512;
			}
			if (local12 <= 0) {
				local12 = 1;
			}
			if (this.anInt3100 != local12) {
				this.anInt3100 = local12;
				this.aClass2_20 = null;
			}
			if (this.aClass174Array2 != null) {
				this.anInt3098 = 0;
				@Pc(44) int[] local44 = new int[this.aClass174Array2.length];
				for (@Pc(46) int local46 = 0; local46 < this.aClass174Array2.length; local46++) {
					@Pc(53) Class174 local53 = this.aClass174Array2[local46];
					if (local53.method4373(this.anInt3097, this.anInt3089, this.anInt3087, this.anInt3096)) {
						local44[this.anInt3098] = local53.anInt5050;
						this.aClass174Array1[this.anInt3098++] = local53;
					}
				}
				Static337.method5133(0, this.anInt3098 - 1, local44, this.aClass174Array1);
			}
			this.aBoolean214 = true;
		}
		@Pc(106) boolean local106 = false;
		if (this.aBoolean214) {
			this.aBoolean214 = false;
			for (@Pc(117) int local117 = this.anInt3098 - 1; local117 >= 0; local117--) {
				@Pc(128) boolean local128 = this.aClass174Array1[local117].method4371(arg1, this.aClass174_1);
				this.aBoolean214 |= !local128;
				local106 |= local128;
			}
		}
		return local106;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILclient!qa;IIIIII)V")
	public void method2621(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class122 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(11) int local11 = arg7 + arg3 & 0x3FFF;
		if (this.anInt3094 == -1) {
			arg2.f(arg8, arg4, arg5, arg0, arg6, 0);
		} else {
			@Pc(22) Class220 local22 = Static13.anInterface8_3.method878(this.anInt3094);
			if (this.aClass2_20 == null && Static13.anInterface8_3.method879(this.anInt3094)) {
				@Pc(58) int[] local58 = local22.aBoolean445 ? Static13.anInterface8_3.method880(this.anInt3100, this.anInt3094, this.anInt3100, 0.7F) : Static13.anInterface8_3.method876(this.anInt3094, false, this.anInt3100, 0.7F, this.anInt3100);
				this.aClass2_20 = arg2.method7268(local58, this.anInt3100, this.anInt3100, this.anInt3100);
			}
			if (local22.aBoolean445) {
				arg2.f(arg8, arg4, arg5, arg0, arg6, 0);
			}
			if (this.aClass2_20 != null) {
				@Pc(91) int local91 = local22.aBoolean445 ? 1 : 0;
				@Pc(97) int local97 = arg0 * arg1 / -4096;
				@Pc(109) int local109;
				for (local109 = (arg5 - arg0) / 2 + arg0 * local11 / 4096; local109 > arg0; local109 -= arg0) {
				}
				while (local109 < 0) {
					local109 += arg0;
				}
				while (arg0 < local97) {
					local97 -= arg0;
				}
				while (local97 < 0) {
					local97 += arg0;
				}
				for (@Pc(159) int local159 = local109 - arg0; local159 < arg5; local159 += arg0) {
					for (@Pc(166) int local166 = local97 - arg0; local166 < arg0; local166 += arg0) {
						this.aClass2_20.ra(arg8 + local159, arg4 + local166, arg0, arg0, 1, 0, local91);
					}
				}
			}
		}
		for (@Pc(215) int local215 = this.anInt3098 - 1; local215 >= 0; local215--) {
			this.aClass174Array1[local215].method4380(arg2, arg8, arg4, arg5, arg0, arg1, local11);
		}
	}
}
