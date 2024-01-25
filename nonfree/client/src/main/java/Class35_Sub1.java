import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class35_Sub1 extends Class35 {

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
	private int anInt1173 = 0;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
	private int anInt1178 = 0;

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "I")
	private int anInt1181 = 0;

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "I")
	private int anInt1189 = 0;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
	private final int anInt1182;

	@OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
	private final int anInt1176;

	@OriginalMember(owner = "client!cf", name = "q", descriptor = "Lclient!kw;")
	private final Class39_Sub2 aClass39_Sub2_4;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!hc;")
	private final Interface8 anInterface8_1;

	@OriginalMember(owner = "client!cf", name = "z", descriptor = "Z")
	private final boolean aBoolean69;

	@OriginalMember(owner = "client!cf", name = "u", descriptor = "Z")
	private final boolean aBoolean68;

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "Z")
	private final boolean aBoolean70;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Z")
	private final boolean aBoolean66;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!kw;IIZ)V")
	public Class35_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt1182 = arg1;
		this.anInt1176 = arg2;
		this.aClass39_Sub2_4 = arg0;
		this.anInterface8_1 = arg0.method6122(arg1, Static268.aClass171_10, arg3 ? Static51.aClass150_1 : Static297.aClass150_11, arg2);
		this.aBoolean69 = arg1 != this.anInterface8_1.method5775();
		this.aBoolean68 = this.anInterface8_1.method5778() != arg2;
		this.aBoolean70 = !this.aBoolean69 && this.anInterface8_1.method5774();
		this.aBoolean66 = !this.aBoolean68 && this.anInterface8_1.method5774();
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!kw;II[III)V")
	public Class35_Sub1(@OriginalArg(0) Class39_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1182 = arg1;
		this.aClass39_Sub2_4 = arg0;
		this.anInt1176 = arg2;
		this.anInterface8_1 = arg0.method6180(arg5, arg3, arg1, arg2, false, arg4);
		this.aBoolean69 = this.anInterface8_1.method5775() != arg1;
		this.aBoolean68 = arg2 != this.anInterface8_1.method5778();
		this.aBoolean70 = !this.aBoolean69 && this.anInterface8_1.method5774();
		this.aBoolean66 = !this.aBoolean68 && this.anInterface8_1.method5774();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!pa;II)V")
	@Override
	public void method7345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class209_Sub2 local6 = (Class209_Sub2) arg2;
		@Pc(11) int local11 = arg1 + this.anInt1173;
		@Pc(14) Interface8 local14 = local6.anInterface8_4;
		@Pc(19) int local19 = arg0 + this.anInt1178;
		this.anInterface8_1.method7130(Static442.aClass240_8);
		this.aClass39_Sub2_4.method6140();
		this.aClass39_Sub2_4.method6179(this.anInterface8_1);
		this.aClass39_Sub2_4.method6088(1);
		this.aClass39_Sub2_4.method6164(1);
		@Pc(49) Class181_Sub2 local49 = this.aClass39_Sub2_4.method6158();
		local49.method5401((float) this.anInt1182, 0.0F, (float) this.anInt1176);
		local49.TA(local19, local11, 0);
		this.aClass39_Sub2_4.method6089();
		@Pc(73) Class181_Sub2 local73 = this.aClass39_Sub2_4.method6133();
		local73.method5401(this.anInterface8_1.method5781((float) this.anInt1182), 1.0F, this.anInterface8_1.method5777((float) this.anInt1176));
		this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
		this.aClass39_Sub2_4.method6191(1);
		this.aClass39_Sub2_4.method6179(local14);
		this.aClass39_Sub2_4.method6093(Static99.aClass165_2, Static389.aClass165_3);
		this.aClass39_Sub2_4.method6192(0, Static409.aClass111_3);
		@Pc(123) Class181_Sub2 local123 = this.aClass39_Sub2_4.method6133();
		local123.method5401(local14.method5781((float) this.anInt1182), 1.0F, local14.method5777((float) this.anInt1176));
		local123.method5402(local14.method5777((float) (local11 - arg4)), local14.method5781((float) (local19 - arg3)), 0.0F);
		this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
		this.aClass39_Sub2_4.method6166();
		this.aClass39_Sub2_4.method6111();
		this.aClass39_Sub2_4.method6192(0, Static132.aClass111_1);
		this.aClass39_Sub2_4.method6093(Static389.aClass165_3, Static389.aClass165_3);
		this.aClass39_Sub2_4.method6179(null);
		this.aClass39_Sub2_4.method6191(0);
		this.aClass39_Sub2_4.method6111();
	}

	@OriginalMember(owner = "client!cf", name = "BA", descriptor = "(III)V")
	@Override
	public void BA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "(IIIIIII)V")
	@Override
	public void i(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class181_Sub2 local10 = this.aClass39_Sub2_4.method6158();
		@Pc(15) Class181_Sub2 local15 = this.aClass39_Sub2_4.method6133();
		this.anInterface8_1.method7130(Static442.aClass240_8);
		this.aClass39_Sub2_4.method6140();
		this.aClass39_Sub2_4.method6179(this.anInterface8_1);
		this.aClass39_Sub2_4.method6088(arg6);
		this.aClass39_Sub2_4.method6164(arg4);
		this.aClass39_Sub2_4.method6192(1, Static254.aClass111_2);
		this.aClass39_Sub2_4.method6085(Static254.aClass111_2, 1);
		this.aClass39_Sub2_4.method6203(arg5);
		@Pc(70) boolean local70 = this.aBoolean66 && this.anInt1173 == 0 && this.anInt1189 == 0;
		@Pc(83) boolean local83 = this.aBoolean70 && this.anInt1178 == 0 && this.anInt1181 == 0;
		if (local83 & local70) {
			local15.method5401(this.anInterface8_1.method5781((float) arg2), 1.0F, this.anInterface8_1.method5777((float) arg3));
			local10.method5401((float) arg2, 0.0F, (float) arg3);
			local10.TA(arg0, arg1, 0);
			this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
			this.aClass39_Sub2_4.method6089();
			this.aClass39_Sub2_4.method6166();
		} else {
			@Pc(93) int local93;
			@Pc(96) int local96;
			@Pc(123) int local123;
			@Pc(129) int local129;
			@Pc(176) int local176;
			if (local83) {
				local93 = arg3 + arg1;
				local96 = this.ma();
				local15.method5401(this.anInterface8_1.method5781((float) arg2), 1.0F, this.anInterface8_1.method5777((float) this.anInt1176));
				this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
				local123 = arg1 + this.anInt1173;
				local129 = local123 + this.anInt1176;
				while (local129 <= local93) {
					local10.method5401((float) arg2, 0.0F, (float) this.anInt1176);
					local10.TA(arg0, local123, 0);
					this.aClass39_Sub2_4.method6089();
					local129 += local96;
					this.aClass39_Sub2_4.method6166();
					local123 += local96;
				}
				if (local123 < local93) {
					local176 = local93 - local123;
					local15.method5401(this.anInterface8_1.method5781((float) arg2), 1.0F, this.anInterface8_1.method5777((float) local176));
					this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
					local10.method5401((float) arg2, 0.0F, (float) local176);
					local10.TA(arg0, local123, 0);
					this.aClass39_Sub2_4.method6089();
					this.aClass39_Sub2_4.method6166();
				}
			} else if (local70) {
				local93 = arg0 + arg2;
				local96 = this.EA();
				local15.method5401(this.anInterface8_1.method5781((float) this.anInt1182), 1.0F, this.anInterface8_1.method5777((float) arg3));
				this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
				local123 = arg0 + this.anInt1178;
				for (local129 = this.anInt1182 + local123; local129 <= local93; local129 += local96) {
					local10.method5401((float) this.anInt1182, 0.0F, (float) arg3);
					local10.TA(local123, arg1, 0);
					this.aClass39_Sub2_4.method6089();
					local123 += local96;
					this.aClass39_Sub2_4.method6166();
				}
				if (local93 > local123) {
					local176 = local93 - local123;
					local15.method5401(this.anInterface8_1.method5781((float) local176), 1.0F, this.anInterface8_1.method5777((float) arg3));
					this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
					local10.method5401((float) local176, 0.0F, (float) arg3);
					local10.TA(local123, arg1, 0);
					this.aClass39_Sub2_4.method6089();
					this.aClass39_Sub2_4.method6166();
				}
			} else {
				local93 = arg3 + arg1;
				local96 = arg2 + arg0;
				local123 = this.EA();
				local129 = this.ma();
				local176 = arg1 + this.anInt1173;
				@Pc(276) int local276;
				@Pc(281) int local281;
				@Pc(329) int local329;
				for (@Pc(246) int local246 = local176 + this.anInt1176; local246 <= local93; local246 += local129) {
					local15.method5401(this.anInterface8_1.method5781((float) this.anInt1182), 1.0F, this.anInterface8_1.method5777((float) this.anInt1176));
					this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
					local276 = this.anInt1178 + arg0;
					local281 = this.anInt1182 + local276;
					while (local96 >= local281) {
						local10.method5401((float) this.anInt1182, 0.0F, (float) this.anInt1176);
						local10.TA(local276, local176, 0);
						this.aClass39_Sub2_4.method6089();
						local276 += local123;
						local281 += local123;
						this.aClass39_Sub2_4.method6166();
					}
					if (local276 < local96) {
						local329 = local96 - local276;
						local15.method5401(this.anInterface8_1.method5781((float) local329), 1.0F, this.anInterface8_1.method5777((float) this.anInt1176));
						this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
						local10.method5401((float) local329, 0.0F, (float) this.anInt1176);
						local10.TA(local276, local176, 0);
						this.aClass39_Sub2_4.method6089();
						this.aClass39_Sub2_4.method6166();
					}
					local176 += local129;
				}
				if (local176 < local93) {
					local276 = local93 - local176;
					local15.method5401(this.anInterface8_1.method5781((float) this.anInt1182), 1.0F, this.anInterface8_1.method5777((float) local276));
					this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
					local281 = this.anInt1178 + arg0;
					local329 = this.anInt1182 + local281;
					while (local96 >= local329) {
						local10.method5401((float) this.anInt1182, 0.0F, (float) local276);
						local10.TA(local281, local176, 0);
						this.aClass39_Sub2_4.method6089();
						local329 += local123;
						this.aClass39_Sub2_4.method6166();
						local281 += local123;
					}
					if (local96 > local281) {
						@Pc(482) int local482 = local96 - local281;
						local15.method5401(this.anInterface8_1.method5781((float) local482), 1.0F, this.anInterface8_1.method5777((float) local276));
						this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
						local10.method5401((float) local482, 0.0F, (float) local276);
						local10.TA(local281, local176, 0);
						this.aClass39_Sub2_4.method6089();
						this.aClass39_Sub2_4.method6166();
					}
				}
			}
		}
		this.aClass39_Sub2_4.method6111();
		this.aClass39_Sub2_4.method6192(1, Static409.aClass111_3);
		this.aClass39_Sub2_4.method6085(Static409.aClass111_3, 1);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(FFFFFFLclient!pa;II)V")
	@Override
	protected void method7344(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class209 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class181_Sub2 local8 = this.aClass39_Sub2_4.method6158();
		@Pc(13) Class181_Sub2 local13 = this.aClass39_Sub2_4.method6133();
		@Pc(16) Class209_Sub2 local16 = (Class209_Sub2) arg6;
		@Pc(19) Interface8 local19 = local16.anInterface8_4;
		this.anInterface8_1.method7130(Static539.aClass240_11);
		this.aClass39_Sub2_4.method6140();
		this.aClass39_Sub2_4.method6179(this.anInterface8_1);
		this.aClass39_Sub2_4.method6088(1);
		this.aClass39_Sub2_4.method6164(1);
		if (this.aBoolean67) {
			@Pc(84) float local84 = (float) this.anInt1182 / (float) this.EA();
			@Pc(92) float local92 = (float) this.anInt1176 / (float) this.ma();
			local8.method5391(1.0F, 0.0F, (arg2 - arg0) * local84, 0.0F, (arg5 - arg1) * local92, local92 * (arg4 - arg0), 0.0F, local84 * (arg3 - arg1), 0.0F);
			local8.method5402(local92 * ((float) this.anInt1173 + arg1), local84 * ((float) this.anInt1178 + arg0), 0.0F);
		} else {
			local8.method5391(1.0F, 0.0F, arg2 - arg0, 0.0F, arg5 - arg1, arg4 - arg0, 0.0F, arg3 - arg1, 0.0F);
			local8.method5402(arg1, arg0, 0.0F);
		}
		local13.method5401(this.anInterface8_1.method5781((float) this.anInt1182), 1.0F, this.anInterface8_1.method5777((float) this.anInt1176));
		this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
		this.aClass39_Sub2_4.method6191(1);
		this.aClass39_Sub2_4.method6179(local19);
		this.aClass39_Sub2_4.method6093(Static99.aClass165_2, Static389.aClass165_3);
		this.aClass39_Sub2_4.method6192(0, Static409.aClass111_3);
		@Pc(190) Class181_Sub2 local190 = this.aClass39_Sub2_4.method6133();
		local190.EA(local8);
		local190.TA(-arg7, -arg8, 0);
		local190.method5394(local19.method5777(1.0F), 1.0F, local19.method5781(1.0F));
		this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
		this.aClass39_Sub2_4.method6089();
		this.aClass39_Sub2_4.method6166();
		this.aClass39_Sub2_4.method6111();
		this.aClass39_Sub2_4.method6192(0, Static132.aClass111_1);
		this.aClass39_Sub2_4.method6093(Static389.aClass165_3, Static389.aClass165_3);
		this.aClass39_Sub2_4.method6179(null);
		this.aClass39_Sub2_4.method6191(0);
		this.aClass39_Sub2_4.method6111();
	}

	@OriginalMember(owner = "client!cf", name = "KA", descriptor = "(IIII)V")
	@Override
	public void KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1181 = arg2;
		this.anInt1189 = arg3;
		this.anInt1173 = arg1;
		this.anInt1178 = arg0;
		this.aBoolean67 = this.anInt1178 != 0 || this.anInt1173 != 0 || this.anInt1181 != 0 || this.anInt1189 != 0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII[III)V")
	private void method1140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface8_1.method5779(arg0, arg3, arg4, arg5, arg1, arg2);
	}

	@OriginalMember(owner = "client!cf", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass39_Sub2_4.v(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method1140(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!cf", name = "DA", descriptor = "(IIIII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class181_Sub2 local8 = this.aClass39_Sub2_4.method6158();
		@Pc(13) Class181_Sub2 local13 = this.aClass39_Sub2_4.method6133();
		@Pc(18) int local18 = arg0 + this.anInt1178;
		@Pc(23) int local23 = arg1 + this.anInt1173;
		this.anInterface8_1.method7130(Static442.aClass240_8);
		this.aClass39_Sub2_4.method6140();
		this.aClass39_Sub2_4.method6179(this.anInterface8_1);
		this.aClass39_Sub2_4.method6088(arg4);
		this.aClass39_Sub2_4.method6164(arg2);
		this.aClass39_Sub2_4.method6192(1, Static254.aClass111_2);
		this.aClass39_Sub2_4.method6085(Static254.aClass111_2, 1);
		this.aClass39_Sub2_4.method6203(arg3);
		local8.method5401((float) this.anInt1182, 0.0F, (float) this.anInt1176);
		local8.TA(local18, local23, 0);
		local13.method5401(this.anInterface8_1.method5781((float) this.anInt1182), 1.0F, this.anInterface8_1.method5777((float) this.anInt1176));
		this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
		this.aClass39_Sub2_4.method6089();
		this.aClass39_Sub2_4.method6166();
		this.aClass39_Sub2_4.method6111();
		this.aClass39_Sub2_4.method6192(1, Static409.aClass111_3);
		this.aClass39_Sub2_4.method6085(Static409.aClass111_3, 1);
	}

	@OriginalMember(owner = "client!cf", name = "la", descriptor = "()I")
	@Override
	public int la() {
		return this.anInt1176;
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "()I")
	@Override
	public int c() {
		return this.anInt1182;
	}

	@OriginalMember(owner = "client!cf", name = "CA", descriptor = "(FFFFFFIII)V")
	@Override
	protected void CA(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(8) Class181_Sub2 local8 = this.aClass39_Sub2_4.method6158();
		@Pc(13) Class181_Sub2 local13 = this.aClass39_Sub2_4.method6133();
		this.anInterface8_1.method7130(this.aBoolean69 || this.aBoolean68 ? Static442.aClass240_8 : Static539.aClass240_11);
		this.aClass39_Sub2_4.method6140();
		this.aClass39_Sub2_4.method6179(this.anInterface8_1);
		this.aClass39_Sub2_4.method6088(arg8);
		this.aClass39_Sub2_4.method6164(arg6);
		this.aClass39_Sub2_4.method6192(1, Static254.aClass111_2);
		this.aClass39_Sub2_4.method6085(Static254.aClass111_2, 1);
		this.aClass39_Sub2_4.method6203(arg7);
		if (this.aBoolean67) {
			@Pc(70) float local70 = (float) this.EA();
			@Pc(74) float local74 = (float) this.ma();
			@Pc(80) float local80 = (arg2 - arg0) / local70;
			@Pc(86) float local86 = (arg3 - arg1) / local70;
			@Pc(93) float local93 = (arg4 - arg0) / local74;
			@Pc(99) float local99 = (arg5 - arg1) / local74;
			@Pc(105) float local105 = (float) this.anInt1173 * local93;
			@Pc(111) float local111 = local99 * (float) this.anInt1173;
			@Pc(117) float local117 = (float) this.anInt1178 * local80;
			@Pc(123) float local123 = (float) this.anInt1178 * local86;
			@Pc(130) float local130 = -local80 * (float) this.anInt1181;
			@Pc(137) float local137 = -local86 * (float) this.anInt1181;
			@Pc(144) float local144 = (float) this.anInt1189 * -local93;
			arg4 = arg4 + local117 + local144;
			arg3 = local111 + arg3 + local137;
			arg2 = local105 + local130 + arg2;
			@Pc(169) float local169 = (float) this.anInt1189 * -local99;
			arg1 = arg1 + local123 + local111;
			arg0 = local105 + arg0 + local117;
			arg5 = local123 + arg5 + local169;
		}
		local8.method5391(1.0F, 0.0F, arg2 - arg0, 0.0F, arg5 - arg1, -arg0 + arg4, 0.0F, arg3 - arg1, 0.0F);
		local8.method5402(arg1, arg0, 0.0F);
		local13.method5401(this.anInterface8_1.method5781((float) this.anInt1182), 1.0F, this.anInterface8_1.method5777((float) this.anInt1176));
		this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
		this.aClass39_Sub2_4.method6089();
		this.aClass39_Sub2_4.method6166();
		this.aClass39_Sub2_4.method6111();
		this.aClass39_Sub2_4.method6192(1, Static409.aClass111_3);
		this.aClass39_Sub2_4.method6085(Static409.aClass111_3, 1);
	}

	@OriginalMember(owner = "client!cf", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		return this.anInt1181 + this.anInt1182 + this.anInt1178;
	}

	@OriginalMember(owner = "client!cf", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		return this.anInt1173 + this.anInt1176 + this.anInt1189;
	}

	@OriginalMember(owner = "client!cf", name = "ra", descriptor = "(IIIIIII)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class181_Sub2 local8 = this.aClass39_Sub2_4.method6158();
		@Pc(13) Class181_Sub2 local13 = this.aClass39_Sub2_4.method6133();
		this.anInterface8_1.method7130(this.aBoolean69 || this.aBoolean68 ? Static442.aClass240_8 : Static539.aClass240_11);
		this.aClass39_Sub2_4.method6140();
		this.aClass39_Sub2_4.method6179(this.anInterface8_1);
		this.aClass39_Sub2_4.method6088(arg6);
		this.aClass39_Sub2_4.method6164(arg4);
		this.aClass39_Sub2_4.method6192(1, Static254.aClass111_2);
		this.aClass39_Sub2_4.method6085(Static254.aClass111_2, 1);
		this.aClass39_Sub2_4.method6203(arg5);
		local13.method5401(this.anInterface8_1.method5781((float) this.anInt1182), 1.0F, this.anInterface8_1.method5777((float) this.anInt1176));
		if (this.aBoolean67) {
			arg2 = this.anInt1182 * arg2 / this.EA();
			arg3 = arg3 * this.anInt1176 / this.ma();
			arg1 += arg3 * this.anInt1173 / this.anInt1176;
			arg0 += this.anInt1178 * arg2 / this.anInt1182;
		}
		local8.method5401((float) arg2, 0.0F, (float) arg3);
		local8.TA(arg0, arg1, 0);
		this.aClass39_Sub2_4.method6091(Static532.aClass224_6);
		this.aClass39_Sub2_4.method6089();
		this.aClass39_Sub2_4.method6166();
		this.aClass39_Sub2_4.method6111();
		this.aClass39_Sub2_4.method6192(1, Static409.aClass111_3);
		this.aClass39_Sub2_4.method6085(Static409.aClass111_3, 1);
	}
}
