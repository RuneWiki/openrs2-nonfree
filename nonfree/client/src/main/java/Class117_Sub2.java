import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class117_Sub2 extends Class117 {

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas7;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
	private int anInt7058;

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "Lclient!vs;")
	private Class1_Sub12 aClass1_Sub12_1;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
	public int anInt7059;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
	public int anInt7064;

	@OriginalMember(owner = "client!wc", name = "I", descriptor = "I")
	public int anInt7066;

	@OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
	public int anInt7067;

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
	public int anInt7068;

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
	private int anInt7070;

	@OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
	public int anInt7071;

	@OriginalMember(owner = "client!wc", name = "O", descriptor = "Lclient!o;")
	private Class85 aClass85_22;

	@OriginalMember(owner = "client!wc", name = "X", descriptor = "[Lclient!bv;")
	private Class33[] aClass33Array1;

	@OriginalMember(owner = "client!wc", name = "ab", descriptor = "F")
	private float aFloat86;

	@OriginalMember(owner = "client!wc", name = "db", descriptor = "[I")
	public int[] anIntArray521;

	@OriginalMember(owner = "client!wc", name = "gb", descriptor = "I")
	public int anInt7083;

	@OriginalMember(owner = "client!wc", name = "hb", descriptor = "F")
	private float aFloat87;

	@OriginalMember(owner = "client!wc", name = "ib", descriptor = "I")
	public int anInt7084;

	@OriginalMember(owner = "client!wc", name = "jb", descriptor = "I")
	public int anInt7085;

	@OriginalMember(owner = "client!wc", name = "kb", descriptor = "Z")
	public boolean aBoolean618;

	@OriginalMember(owner = "client!wc", name = "mb", descriptor = "I")
	public int anInt7086;

	@OriginalMember(owner = "client!wc", name = "nb", descriptor = "I")
	public int anInt7087;

	@OriginalMember(owner = "client!wc", name = "qb", descriptor = "Lclient!o;")
	private Class85 aClass85_23;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "Z")
	private boolean aBoolean614;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Z")
	private boolean aBoolean615;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "Lclient!qi;")
	private Class208 aClass208_40;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
	private int anInt7061;

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
	public int anInt7063;

	@OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
	public int anInt7065;

	@OriginalMember(owner = "client!wc", name = "W", descriptor = "I")
	public int anInt7077;

	@OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
	public int anInt7069;

	@OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
	private int anInt7078;

	@OriginalMember(owner = "client!wc", name = "Z", descriptor = "I")
	public int anInt7079;

	@OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
	public int anInt7072;

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "I")
	public int anInt7073;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "Z")
	public boolean aBoolean616;

	@OriginalMember(owner = "client!wc", name = "V", descriptor = "I")
	public int anInt7076;

	@OriginalMember(owner = "client!wc", name = "S", descriptor = "I")
	public int anInt7074;

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "I")
	private int anInt7075;

	@OriginalMember(owner = "client!wc", name = "fb", descriptor = "I")
	public int anInt7082;

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
	private int anInt7060;

	@OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
	public int anInt7080;

	@OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
	public int anInt7081;

	@OriginalMember(owner = "client!wc", name = "cb", descriptor = "Z")
	private boolean aBoolean617;

	@OriginalMember(owner = "client!wc", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
	public int anInt7062;

	@OriginalMember(owner = "client!wc", name = "ob", descriptor = "I")
	public int anInt7088;

	@OriginalMember(owner = "client!wc", name = "R", descriptor = "Lclient!fc;")
	private final Class77 aClass77_62;

	@OriginalMember(owner = "client!wc", name = "pb", descriptor = "I")
	private int anInt7089;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "Lclient!fc;")
	private final Class77 aClass77_61;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "Lclient!gj;")
	public Class34_Sub1 aClass34_Sub1_3;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(ILclient!l;)V")
	private Class117_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
		this.aBoolean614 = false;
		this.aBoolean615 = false;
		this.aClass208_40 = new Class208(4);
		this.anInt7061 = 3500;
		this.anInt7063 = 78642;
		this.anInt7065 = 0;
		this.anInt7077 = 0;
		this.anInt7069 = 512;
		this.anInt7078 = 0;
		this.anInt7079 = 0;
		this.anInt7072 = 50;
		this.anInt7073 = 3500;
		this.aBoolean616 = false;
		this.anInt7076 = 0;
		this.anInt7074 = this.anInt7061 - 255;
		this.anInt7075 = 0;
		this.anInt7082 = 0;
		this.anInt7060 = 0;
		this.anInt7080 = 512;
		this.anInt7081 = 75518;
		this.aBoolean617 = false;
		this.lb = 0;
		this.anInt7062 = 45823;
		this.anInt7088 = 0;
		this.aClass77_62 = new Class77(16);
		this.anInt7089 = -1;
		this.aClass77_61 = new Class77(20);
		this.aClass34_Sub1_3 = new Class34_Sub1();
		this.method5718(1);
		this.method5722(0);
		Static171.method2270(false, true);
		this.aBoolean614 = true;
	}

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;)V")
	public Class117_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2) {
		this(arg0, arg2);
		this.method5703(arg1);
		this.method5688(arg1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!bv;")
	public Class33 method5733(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7067; local1++) {
			if (this.aClass33Array1[local1].aRunnable1 == arg0) {
				return this.aClass33Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "()Z")
	@Override
	public boolean method5721() {
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5688(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas7 = null;
			this.aClass1_Sub12_1 = null;
			if (this.aClass85_22 == null) {
				this.anIntArray521 = null;
				this.anInt7083 = this.anInt7070 = 1;
				this.method5741();
			}
			return;
		}
		@Pc(10) Class1_Sub12 local10 = (Class1_Sub12) this.aClass208_40.method4405((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas7 = arg0;
		this.aClass1_Sub12_1 = local10;
		if (this.aClass85_22 != null) {
			return;
		}
		this.anIntArray521 = local10.anIntArray237;
		this.anInt7083 = local10.anInt3188;
		this.anInt7070 = local10.anInt3186;
		this.method5741();
		return;
	}

	@OriginalMember(owner = "client!wc", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "(I)Z")
	public boolean method5734(@OriginalArg(0) int arg0) {
		return super.anInterface4_10.method5089(arg0);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5690(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5686(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub12 local8 = (Class1_Sub12) this.aClass208_40.method4405((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method5953();
		local8 = Static439.method5508(arg0);
		this.aClass208_40.method4413((long) arg0.hashCode(), local8);
		if (this.aCanvas7 != arg0 || this.aClass85_22 != null) {
			return;
		}
		this.aClass1_Sub12_1 = local8;
		this.anIntArray521 = local8.anIntArray237;
		this.anInt7083 = local8.anInt3188;
		this.anInt7070 = local8.anInt3186;
		this.method5741();
	}

	@OriginalMember(owner = "client!wc", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt7083;
		@Pc(35) int local35 = this.anInt7083 - arg2;
		if (arg1 + arg3 > this.anInt7082) {
			arg3 -= arg1 + arg3 - this.anInt7082;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt7088) {
			local59 = this.anInt7088 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt7083;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt7065) {
			local59 = arg0 + arg2 - this.anInt7065;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt7077) {
			local59 = this.anInt7077 - arg0;
			arg2 -= local59;
			local30 += local59;
			local6 += local14 * local59;
			local35 += local59;
		}
		local59 = arg4 >>> 24;
		@Pc(132) int local132 = arg5 >>> 24;
		@Pc(145) int local145;
		@Pc(148) int local148;
		@Pc(155) int local155;
		@Pc(158) int local158;
		if (arg8 == 0 || arg8 == 1 && local59 == 255 && local132 == 255) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					if (arg6[(local6 >> 16) + local155] == 0) {
						this.anIntArray521[local30++] = arg4;
					} else {
						this.anIntArray521[local30++] = arg5;
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
			return;
		}
		@Pc(222) int local222;
		@Pc(236) int local236;
		@Pc(240) int local240;
		@Pc(245) int local245;
		if (arg8 == 1) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					local236 = local222 >>> 24;
					local240 = 255 - local236;
					local245 = this.anIntArray521[local30];
					this.anIntArray521[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else if (arg8 == 2) {
			local145 = local6;
			for (local148 = -arg3; local148 < 0; local148++) {
				local155 = (local8 >> 16) * arg7;
				for (local158 = -arg2; local158 < 0; local158++) {
					local222 = arg4;
					if (arg6[(local6 >> 16) + local155] != 0) {
						local222 = arg5;
					}
					if (local222 == 0) {
						local30++;
					} else {
						local236 = this.anIntArray521[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray521[local30++] = local240 - local360 | local360 - (local360 >>> 8);
					}
					local6 += local14;
				}
				local8 += local23;
				local6 = local145;
				local30 += local35;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIII)V")
	public void method5735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface4_10.method5090(arg5).aBoolean60) {
			this.ZA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt7089 != arg5) {
			@Pc(26) Class85 local26 = (Class85) this.aClass77_62.method1387((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method5743(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method5745(arg5) ? 64 : 128;
				local26 = this.method5700(local32, local43, local43, local43);
				this.aClass77_62.method1396(local26, (long) arg5);
			}
			this.anInt7089 = arg5;
			this.aClass85_23 = local26;
		}
		this.aClass85_23.ya(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "()V")
	@Override
	public void method5679() {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!e;")
	@Override
	public Class8 method5678(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class8_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5671(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!wc", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt7077 = 0;
		this.anInt7088 = 0;
		this.anInt7065 = this.anInt7083;
		this.anInt7082 = this.anInt7070;
		this.method5737();
	}

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "()Z")
	public boolean method5736() {
		return this.aBoolean615;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)V")
	@Override
	public void method5677(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!wp;I)V")
	@Override
	public void method5723(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) Class111_Sub8[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class8_Sub1[] local3 = new Class8_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class8_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class8_Sub1 local26 = Static6.method115(this, local3);
		local26.method109(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!wc", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		this.anInt7081 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!wc", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class73_Sub2 local2 = (Class73_Sub2) arg1;
		@Pc(5) int[] local5 = local2.anIntArray160;
		@Pc(8) int[] local8 = local2.anIntArray161;
		@Pc(20) int local20;
		if (this.anInt7082 < arg3 + local5.length) {
			local20 = this.anInt7082 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt7088 > arg3) {
			local33 = this.anInt7088 - arg3;
			arg3 = this.anInt7088;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt7083;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt7077 > local58) {
				local62 -= this.anInt7077 - local58;
				local58 = this.anInt7077;
			}
			if (this.anInt7065 < local58 + local62) {
				local62 = this.anInt7065 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray521[local58++] = arg0;
			}
			local49 += this.anInt7083;
		}
	}

	@OriginalMember(owner = "client!wc", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt7083) {
			arg2 = this.anInt7083;
		}
		if (arg3 > this.anInt7070) {
			arg3 = this.anInt7070;
		}
		this.anInt7077 = arg0;
		this.anInt7065 = arg2;
		this.anInt7088 = arg1;
		this.anInt7082 = arg3;
		this.method5737();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
	@Override
	public int method5696(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "()V")
	@Override
	public void method5672() {
	}

	@OriginalMember(owner = "client!wc", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return 0;
	}

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass34_Sub1_3.anInt2120 + (this.aClass34_Sub1_3.anInt2116 * arg0 + this.aClass34_Sub1_3.anInt2121 * arg1 + this.aClass34_Sub1_3.anInt2119 * arg2 >> 15);
		if (local23 < this.anInt7072 || local23 > this.anInt7061) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt7080 * (this.aClass34_Sub1_3.anInt2126 + (this.aClass34_Sub1_3.anInt2118 * arg0 + this.aClass34_Sub1_3.anInt2123 * arg1 + this.aClass34_Sub1_3.anInt2122 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt7069 * (this.aClass34_Sub1_3.anInt2117 + (this.aClass34_Sub1_3.anInt2124 * arg0 + this.aClass34_Sub1_3.anInt2127 * arg1 + this.aClass34_Sub1_3.anInt2125 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt7066 && local73 <= this.anInt7087 && local102 >= this.anInt7064 && local102 <= this.anInt7086) {
			arg3[0] = local73 - this.anInt7066;
			arg3[1] = local102 - this.anInt7064;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
	@Override
	public void method5718(@OriginalArg(0) int arg0) {
		if (this.anInt7067 == arg0) {
			return;
		}
		this.anInt7067 = arg0;
		this.aClass33Array1 = new Class33[this.anInt7067];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7067; local14++) {
			this.aClass33Array1[local14] = new Class33(this);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class85 method5709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt7083 + arg0;
		@Pc(16) int local16 = this.anInt7083 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray521[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class85_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class85_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "()Z")
	@Override
	public boolean method5725() {
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt7072;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([Lclient!e;Lclient!sj;Lclient!c;[Lclient!wp;I)V")
	@Override
	public void method5673(@OriginalArg(0) Class8[] arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class111_Sub8[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class8_Sub1[] local3 = new Class8_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class8_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class8_Sub1 local26 = Static6.method115(this, local3);
		local26.method109(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ud;)V")
	@Override
	public void method5661(@OriginalArg(0) Class59 arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!dd;Z)Lclient!o;")
	@Override
	public Class85 method5707(@OriginalArg(0) Class52 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray114;
		@Pc(5) byte[] local5 = arg0.aByteArray13;
		@Pc(8) int local8 = arg0.anInt1019;
		@Pc(11) int local11 = arg0.anInt1015;
		@Pc(76) Class85_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray14 == null) {
			local20 = new int[local2.length];
			local25 = new byte[local8 * local11];
			for (local27 = 0; local27 < local11; local27++) {
				local32 = local27 * local8;
				for (local34 = 0; local34 < local8; local34++) {
					local25[local32 + local34] = local5[local32 + local34];
				}
			}
			for (local32 = 0; local32 < local2.length; local32++) {
				local20[local32] = local2[local32];
			}
			local76 = new Class85_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray14;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class85_Sub1_Sub3(this, local20, local8, local11);
				local76 = new Class85_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class85_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.ha(arg0.anInt1020, arg0.anInt1017, arg0.anInt1016, arg0.anInt1018);
		return local76;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ul;[Lclient!dd;Z)Lclient!la;")
	@Override
	public Class137 method5680(@OriginalArg(0) Class252 arg0, @OriginalArg(1) Class52[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt1019;
			local7[local11] = arg1[local11].anInt1015;
			if (arg1[local11].aByteArray14 != null) {
			}
		}
		return new Class137_Sub4(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class139 method5657(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class139_Sub1(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "()V")
	private void method5737() {
		this.anInt7066 = this.anInt7077 - this.anInt7085;
		this.anInt7087 = this.anInt7065 - this.anInt7085;
		this.anInt7064 = this.anInt7088 - this.anInt7071;
		this.anInt7086 = this.anInt7082 - this.anInt7071;
		for (@Pc(29) int local29 = 0; local29 < this.anInt7067; local29++) {
			@Pc(36) Class92 local36 = this.aClass33Array1[local29].aClass92_2;
			local36.anInt2058 = this.anInt7085 - this.anInt7077;
			local36.anInt2054 = this.anInt7071 - this.anInt7088;
			local36.anInt2053 = this.anInt7065 - this.anInt7077;
			local36.anInt2056 = this.anInt7082 - this.anInt7088;
		}
		@Pc(78) int local78 = this.anInt7088 * this.anInt7083 + this.anInt7077;
		for (@Pc(81) int local81 = this.anInt7088; local81 < this.anInt7082; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt7067; local84++) {
				this.aClass33Array1[local84].aClass92_2.anIntArray178[local81 - this.anInt7088] = local78;
			}
			local78 += this.anInt7083;
		}
	}

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "()V")
	private void method5738() {
		if (this.aFloat87 == 0.0F) {
			this.anInt7073 = this.anInt7061;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt7061;
		@Pc(12) float local12 = (float) this.anInt7072;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat86 / (this.aFloat87 + this.aFloat86);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat87;
		this.anInt7073 = (int) (((float) this.anInt7061 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!wc", name = "i", descriptor = "()Z")
	@Override
	public boolean method5689() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7076 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt7076 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt7076 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt7076 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt7076 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean618 = false;
		} else {
			this.aBoolean618 = true;
		}
	}

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "(I)[I")
	public int[] method5739(@OriginalArg(0) int arg0) {
		@Pc(2) Class77 local2 = this.aClass77_61;
		@Pc(12) Class1_Sub21 local12;
		synchronized (this.aClass77_61) {
			local12 = (Class1_Sub21) this.aClass77_61.method1387((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_10.method5089(arg0)) {
					return null;
				}
				@Pc(32) Class25 local32 = super.anInterface4_10.method5090(arg0);
				@Pc(42) int local42 = local32.aBoolean54 || this.aBoolean617 ? 64 : 128;
				local12 = new Class1_Sub21(arg0, local42, super.anInterface4_10.method5088(local42, arg0, 0.7F, true, local42), local32.aBoolean61);
				this.aClass77_61.method1396(local12, (long) arg0);
			}
		}
		local12.aBoolean252 = true;
		return local12.method2100();
	}

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt7076 = this.anInt7075;
		this.aBoolean616 = false;
	}

	@OriginalMember(owner = "client!wc", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt7083 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray521[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "()Z")
	@Override
	public boolean method5692() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "()Z")
	@Override
	public boolean method5728() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(II)I")
	@Override
	public int method5732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!wc", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt7077) {
			arg2 -= this.anInt7077 - arg0;
			arg0 = this.anInt7077;
		}
		if (arg1 < this.anInt7088) {
			arg3 -= this.anInt7088 - arg1;
			arg1 = this.anInt7088;
		}
		if (arg0 + arg2 > this.anInt7065) {
			arg2 = this.anInt7065 - arg0;
		}
		if (arg1 + arg3 > this.anInt7082) {
			arg3 = this.anInt7082 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt7065 || arg1 > this.anInt7082) {
			return;
		}
		@Pc(67) int local67 = this.anInt7083 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt7083;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(221) int local221;
			if (arg5 == 1) {
				@Pc(205) int local205 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local78 >> 8 & 0xFF00) + (local78 << 24);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local221 = this.anIntArray521[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray521[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray521[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray521[local74++] = local221 - local298 | local298 - (local298 >>> 8);
					}
					local74 += local67;
				}
			} else {
				throw new IllegalArgumentException();
			}
			return;
		}
		local90 = arg2 >> 3;
		local94 = arg2 & 0x7;
		arg2 = local74 - 1;
		for (local101 = -arg3; local101 < 0; local101++) {
			if (local90 > 0) {
				arg0 = local90;
				do {
					arg2++;
					this.anIntArray521[arg2] = arg4;
					arg2++;
					this.anIntArray521[arg2] = arg4;
					arg2++;
					this.anIntArray521[arg2] = arg4;
					arg2++;
					this.anIntArray521[arg2] = arg4;
					arg2++;
					this.anIntArray521[arg2] = arg4;
					arg2++;
					this.anIntArray521[arg2] = arg4;
					arg2++;
					this.anIntArray521[arg2] = arg4;
					arg2++;
					this.anIntArray521[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray521[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "()Z")
	@Override
	public boolean method5714() {
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "()Z")
	@Override
	public boolean method5713() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt7088) {
			local8 = this.anInt7088;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt7082) {
			local21 = this.anInt7082;
		}
		@Pc(30) int local30 = local8;
		@Pc(34) int local34 = arg2 * arg2;
		@Pc(36) int local36 = 0;
		@Pc(40) int local40 = arg1 - local8;
		@Pc(44) int local44 = local40 * local40;
		@Pc(48) int local48 = local44 - local40;
		if (arg1 > local21) {
			arg1 = local21;
		}
		@Pc(57) int local57 = arg3 >>> 24;
		@Pc(91) int local91;
		@Pc(102) int local102;
		@Pc(116) int local116;
		@Pc(118) int local118;
		if (arg4 == 0 || arg4 == 1 && local57 == 255) {
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt7077) {
					local91 = this.anInt7077;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7065) {
					local102 = this.anInt7065;
				}
				local116 = local91 + local30 * this.anInt7083;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray521[local116++] = arg3;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = local30 - arg1;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt7077) {
					local91 = this.anInt7077;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7065 - 1) {
					local102 = this.anInt7065 - 1;
				}
				local116 = local91 + local30 * this.anInt7083;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray521[local116++] = arg3;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
			return;
		}
		@Pc(334) int local334;
		@Pc(340) int local340;
		if (arg4 == 1) {
			@Pc(277) int local277 = ((arg3 & 0xFF00FF) * local57 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local57 >> 8 & 0xFF00) + (local57 << 24);
			local91 = 256 - local57;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local102 = arg0 + 1 - local36;
				if (local102 < this.anInt7077) {
					local102 = this.anInt7077;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt7065) {
					local116 = this.anInt7065;
				}
				local118 = local102 + local30 * this.anInt7083;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray521[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray521[local118++] = local277 + local340;
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local102 = arg0 - local36;
				if (local102 < this.anInt7077) {
					local102 = this.anInt7077;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt7065 - 1) {
					local116 = this.anInt7065 - 1;
				}
				local118 = local102 + local30 * this.anInt7083;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray521[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray521[local118++] = local277 + local340;
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else if (arg4 == 2) {
			@Pc(593) int local593;
			while (local30 < arg1) {
				while (local48 <= local34 || local44 <= local34) {
					local44 += local36 + local36;
					local48 += local36++ + local36;
				}
				local91 = arg0 + 1 - local36;
				if (local91 < this.anInt7077) {
					local91 = this.anInt7077;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7065) {
					local102 = this.anInt7065;
				}
				local116 = local91 + local30 * this.anInt7083;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray521[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray521[local116++] = local340 - local603 | local603 - (local603 >>> 8);
				}
				local30++;
				local44 -= local40-- + local40;
				local48 -= local40 + local40;
			}
			local36 = arg2;
			local40 = -local40;
			local48 = local40 * local40 + local34;
			local44 = local48 - arg2;
			local48 -= local40;
			while (local30 < local21) {
				while (local48 > local34 && local44 > local34) {
					local48 -= local36-- + local36;
					local44 -= local36 + local36;
				}
				local91 = arg0 - local36;
				if (local91 < this.anInt7077) {
					local91 = this.anInt7077;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt7065 - 1) {
					local102 = this.anInt7065 - 1;
				}
				local116 = local91 + local30 * this.anInt7083;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray521[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray521[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!rl;III)V")
	public void method5740(@OriginalArg(0) Class111_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt6562;
		@Pc(4) int local4 = arg3;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.ZA(arg1, arg2, local4, arg0.anInt6561, 1);
			return;
		}
		if (this.anInt7089 != local2) {
			@Pc(32) Class85 local32 = (Class85) this.aClass77_62.method1387((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method5743(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method5745(local2) ? 64 : 128;
				local32 = this.method5700(local38, local48, local48, local48);
				this.aClass77_62.method1396(local32, (long) local2);
			}
			this.anInt7089 = local2;
			this.aClass85_23 = local32;
		}
		this.aClass85_23.ya(arg1 - local4, arg2 - local4, local8, local8, 0, arg0.anInt6561, 1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class73_Sub2 local2 = (Class73_Sub2) arg5;
		@Pc(5) int[] local5 = local2.anIntArray160;
		@Pc(8) int[] local8 = local2.anIntArray161;
		@Pc(17) int local17 = this.anInt7088 > arg7 ? this.anInt7088 : arg7;
		@Pc(32) int local32 = this.anInt7082 < arg7 + local5.length ? this.anInt7082 : arg7 + local5.length;
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg2 + arg3 < 0) {
			arg0 += arg2;
			arg2 = -arg2;
			arg1 += arg3;
			arg3 = -arg3;
		}
		@Pc(83) int local83;
		@Pc(116) int local116;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(145) int local145;
		@Pc(226) int local226;
		@Pc(243) int local243;
		@Pc(248) int local248;
		@Pc(201) int local201;
		if (arg2 <= arg3) {
			arg0 <<= 0x10;
			arg0 += 32768;
			@Pc(390) int local390 = arg2 << 16;
			local83 = (int) Math.floor((double) local390 / (double) arg3 + 0.5D);
			arg3 += arg1;
			if (arg1 < local17) {
				arg0 += local83 * (local17 - arg1);
				arg1 = local17;
			}
			if (arg3 >= local32) {
				arg3 = local32 - 1;
			}
			local116 = arg4 >>> 24;
			if (local116 == 255) {
				while (arg1 <= arg3) {
					local129 = arg0 >> 16;
					local133 = arg1 - arg7;
					local145 = arg6 + local5[local133];
					if (local129 >= this.anInt7077 && local129 < this.anInt7065 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray521[local129 + arg1 * this.anInt7083] = arg4;
					}
					arg0 += local83;
					arg1++;
				}
			} else {
				local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
				local129 = 256 - local116;
				while (arg1 <= arg3) {
					local133 = arg0 >> 16;
					local145 = arg1 - arg7;
					local226 = arg6 + local5[local145];
					if (local133 >= this.anInt7077 && local133 < this.anInt7065 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt7083;
						local248 = this.anIntArray521[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray521[local133 + arg1 * this.anInt7083] = local201 + local584;
					}
					arg0 += local83;
					arg1++;
				}
			}
			return;
		}
		arg1 <<= 0x10;
		arg1 += 32768;
		@Pc(73) int local73 = arg3 << 16;
		local83 = (int) Math.floor((double) local73 / (double) arg2 + 0.5D);
		arg2 += arg0;
		if (arg0 < this.anInt7077) {
			arg1 += local83 * (this.anInt7077 - arg0);
			arg0 = this.anInt7077;
		}
		if (arg2 >= this.anInt7065) {
			arg2 = this.anInt7065 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray521[arg0 + local129 * this.anInt7083] = arg4;
					}
				}
				arg1 += local83;
				arg0++;
			}
			return;
		}
		local201 = ((arg4 & 0xFF00FF) * local116 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local116 >> 8 & 0xFF00) + (local116 << 24);
		local129 = 256 - local116;
		while (arg0 <= arg2) {
			local133 = arg1 >> 16;
			local145 = local133 - arg7;
			if (local133 >= local17 && local133 < local32) {
				local226 = arg6 + local5[local145];
				if (arg0 >= local226 && arg0 < local226 + local8[local145]) {
					local243 = arg0 + local133 * this.anInt7083;
					local248 = this.anIntArray521[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray521[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class33 local3 = this.method5733(Thread.currentThread());
		@Pc(6) Class92 local6 = local3.aClass92_2;
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(21) int local21 = local10 >= 0 ? local10 : -local10;
		@Pc(28) int local28 = local14 >= 0 ? local14 : -local14;
		@Pc(30) int local30 = local21;
		if (local21 < local28) {
			local30 = local28;
		}
		if (local30 == 0) {
			return;
		}
		@Pc(44) int local44 = (local10 << 16) / local30;
		@Pc(50) int local50 = (local14 << 16) / local30;
		if (local50 <= local44) {
			local44 = -local44;
		} else {
			local50 = -local50;
		}
		@Pc(66) int local66 = arg5 * local50 >> 17;
		@Pc(74) int local74 = arg5 * local50 + 1 >> 17;
		@Pc(80) int local80 = arg5 * local44 >> 17;
		@Pc(88) int local88 = arg5 * local44 + 1 >> 17;
		@Pc(93) int local93 = arg0 - local6.method1686();
		@Pc(98) int local98 = arg1 - local6.method1683();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt2055 = 0;
		local6.aBoolean217 = local102 < 0 || local102 > local6.anInt2053 || local106 < 0 || local106 > local6.anInt2053 || local112 < 0 || local112 > local6.anInt2053;
		local6.method1685(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean217 = local102 < 0 || local102 > local6.anInt2053 || local106 < 0 || local106 > local6.anInt2053 || local118 < 0 || local118 > local6.anInt2053;
		local6.method1685(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class73 method5716(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class73_Sub2(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7079 = arg0;
		this.anInt7076 = arg1;
		this.lb = arg2;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5703(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub12 local8 = (Class1_Sub12) this.aClass208_40.method4405((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static439.method5508(arg0);
			this.aClass208_40.method4413((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	@Override
	public void method5670(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt7058;
		for (@Pc(9) Object local9 = this.aClass77_61.method1393(); local9 != null; local9 = this.aClass77_61.method1385()) {
			@Pc(13) Class1_Sub21 local13 = (Class1_Sub21) local9;
			if (local13.aBoolean252) {
				local13.anInt2577 += local4;
				@Pc(27) int local27 = local13.anInt2577 / 20;
				if (local27 > 0) {
					@Pc(36) Class25 local36 = super.anInterface4_10.method5090(local13.anInt2576);
					local13.method2102(local36.aByte8 * local4 * 50 / 1000, local36.aByte13 * local4 * 50 / 1000);
					local13.anInt2577 -= local27 * 20;
				}
				local13.aBoolean252 = false;
			}
		}
		this.anInt7058 = arg0;
		this.aClass77_62.method1386(5);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5727() {
		@Pc(3) Class33 local3 = this.method5733(Thread.currentThread());
		@Pc(6) Class92 local6 = local3.aClass92_2;
		local6.aBoolean220 = false;
		local6.aBoolean220 = false;
		local6.anInt2055 = 0;
		local6.aBoolean217 = true;
		local6.method1682(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean220 = true;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "()Z")
	@Override
	public boolean method5662() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "E", descriptor = "()V")
	private void method5741() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt7067; local1++) {
			this.aClass33Array1[local1].method580();
		}
		this.va();
	}

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "()Z")
	@Override
	public boolean method5691() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.ma(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.ma(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
			}
		} else if (arg2 != 0) {
			if (arg2 + arg3 < 0) {
				arg0 += arg2;
				arg2 = -arg2;
				arg1 += arg3;
				arg3 = -arg3;
			}
			@Pc(104) int local104;
			@Pc(137) int local137;
			@Pc(150) int local150;
			@Pc(213) int local213;
			@Pc(228) int local228;
			@Pc(233) int local233;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt7077) {
					arg1 += local104 * (this.anInt7077 - arg0);
					arg0 = this.anInt7077;
				}
				if (arg2 >= this.anInt7065) {
					arg2 = this.anInt7065 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt7088 && local150 < this.anInt7082) {
							this.anIntArray521[arg0 + local150 * this.anInt7083] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt7088 && local213 < this.anInt7082) {
							local228 = arg0 + local213 * this.anInt7083;
							local233 = this.anIntArray521[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray521[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				arg0 <<= 0x10;
				arg0 += 32768;
				@Pc(357) int local357 = arg2 << 16;
				local104 = (int) Math.floor((double) local357 / (double) arg3 + 0.5D);
				arg3 += arg1;
				if (arg1 < this.anInt7088) {
					arg0 += local104 * (this.anInt7088 - arg1);
					arg1 = this.anInt7088;
				}
				if (arg3 >= this.anInt7082) {
					arg3 = this.anInt7082 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt7077 && local150 < this.anInt7065) {
							this.anIntArray521[local150 + arg1 * this.anInt7083] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt7077 && local213 < this.anInt7065) {
							local228 = local213 + arg1 * this.anInt7083;
							local233 = this.anIntArray521[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray521[local213 + arg1 * this.anInt7083] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.IA(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.IA(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "()V")
	@Override
	public void method5665() {
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "()V")
	@Override
	protected void method5663() {
		if (this.aBoolean614) {
			Static309.method4101(false, true);
			this.aBoolean614 = false;
		}
		this.aClass1_Sub12_1 = null;
		this.aCanvas7 = null;
		this.aClass208_40 = null;
		this.aBoolean615 = true;
	}

	@OriginalMember(owner = "client!wc", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt7077;
		arg0[1] = this.anInt7088;
		arg0[2] = this.anInt7065;
		arg0[3] = this.anInt7082;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class85 method5700(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class85_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class85_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class85_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class85_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!e;Lclient!sj;Lclient!c;Lclient!wp;I)V")
	@Override
	public void method5659(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class232 arg1, @OriginalArg(2) Class34 arg2, @OriginalArg(3) Class111_Sub8 arg3) {
		((Class8_Sub1) arg0).method109(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!wc", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7077 < arg0) {
			this.anInt7077 = arg0;
		}
		if (this.anInt7088 < arg1) {
			this.anInt7088 = arg1;
		}
		if (this.anInt7065 > arg2) {
			this.anInt7065 = arg2;
		}
		if (this.anInt7082 > arg3) {
			this.anInt7082 = arg3;
		}
		this.method5737();
	}

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.P(0, 0, this.anInt7083, this.anInt7070, arg0, 0);
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7072 = arg0;
		this.anInt7061 = arg1;
		this.anInt7074 = this.anInt7061 - 255;
		this.method5738();
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(Z)V")
	@Override
	public void method5702(@OriginalArg(0) boolean arg0) {
		this.aBoolean617 = arg0;
		this.aClass77_61.method1395();
	}

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "(I)I")
	public int method5742(@OriginalArg(0) int arg0) {
		return super.anInterface4_10.method5090(arg0).aShort16 & 0xFFFF;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ud;Lclient!ud;FLclient!ud;)Lclient!ud;")
	@Override
	public Class59 method5720(@OriginalArg(0) Class59 arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class59 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[Lclient!ls;)V")
	@Override
	public void method5693(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub29[] arg1) {
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	@Override
	public void method5704(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "()V")
	@Override
	public void method5731() {
		this.aClass77_61.method1395();
	}

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7075 = this.anInt7076;
		this.anInt7079 = arg0;
		this.anInt7076 = arg1;
		this.lb = arg2;
		this.aBoolean616 = true;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5660(@OriginalArg(0) Class1_Sub4 arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt7061;
	}

	@OriginalMember(owner = "client!wc", name = "w", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5717() {
		return new Class34_Sub1();
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public void method5699(@OriginalArg(0) Class232 arg0) {
		@Pc(3) Class111_Sub1 local3 = arg0.aClass15_1.aClass111_Sub1_1;
		for (@Pc(6) Class111_Sub1 local6 = local3.aClass111_Sub1_10; local6 != local3; local6 = local6.aClass111_Sub1_10) {
			@Pc(10) Class111_Sub1_Sub2 local10 = (Class111_Sub1_Sub2) local6;
			@Pc(15) int local15 = local10.anInt6560 >> 12;
			@Pc(20) int local20 = local10.anInt6566 >> 12;
			@Pc(25) int local25 = local10.anInt6565 >> 12;
			@Pc(49) int local49 = this.aClass34_Sub1_3.anInt2120 + (this.aClass34_Sub1_3.anInt2116 * local15 + this.aClass34_Sub1_3.anInt2121 * local20 + this.aClass34_Sub1_3.anInt2119 * local25 >> 15);
			if (local49 >= this.anInt7072 && local49 <= this.anInt7074) {
				@Pc(90) int local90 = this.anInt7085 + this.anInt7080 * (this.aClass34_Sub1_3.anInt2126 + (this.aClass34_Sub1_3.anInt2118 * local15 + this.aClass34_Sub1_3.anInt2123 * local20 + this.aClass34_Sub1_3.anInt2122 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt7071 + this.anInt7069 * (this.aClass34_Sub1_3.anInt2117 + (this.aClass34_Sub1_3.anInt2124 * local15 + this.aClass34_Sub1_3.anInt2127 * local20 + this.aClass34_Sub1_3.anInt2125 * local25 >> 15)) / local49;
				if (local90 >= this.anInt7077 && local90 <= this.anInt7065 && local122 >= this.anInt7088 && local122 <= this.anInt7082) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method5740(local10, local90, local122, (local10.anInt6563 * this.anInt7080 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "()Z")
	@Override
	public boolean method5711() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt7062 = (int) (arg1 * 65535.0F);
		this.anInt7063 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt7084 = (int) (arg3 * 65535.0F / local26);
		this.anInt7068 = (int) (arg4 * 65535.0F / local26);
		this.anInt7059 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "()Z")
	@Override
	public boolean method5697() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "()Z")
	@Override
	public boolean method5655() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "()Z")
	@Override
	public boolean method5667() {
		return true;
	}

	@OriginalMember(owner = "client!wc", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat86 = arg0;
		this.aFloat87 = arg1;
		this.method5738();
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!wc", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class34 arg0) {
		this.aClass34_Sub1_3 = (Class34_Sub1) arg0;
	}

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "()Lclient!c;")
	@Override
	public Class34 method5685() {
		@Pc(3) Class33 local3 = this.method5733(Thread.currentThread());
		return local3.aClass34_Sub1_2;
	}

	@OriginalMember(owner = "client!wc", name = "o", descriptor = "()Z")
	@Override
	public boolean method5706() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5683(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas7 == arg0) {
			this.method5688(null);
		}
		@Pc(15) Class1_Sub12 local15 = (Class1_Sub12) this.aClass208_40.method4405((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5953();
		}
	}

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "()I")
	@Override
	public int method5710() {
		return 0;
	}

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "()Z")
	@Override
	public boolean method5712() {
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5694(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas7 == null || this.aClass1_Sub12_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas7.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt7083 && local21.y <= this.anInt7070 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub12_1.method2580(local14, local21.width, local21.x, local21.y, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "()V")
	@Override
	public void method5730() {
	}

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
	@Override
	public void method5722(@OriginalArg(0) int arg0) {
		this.aClass33Array1[arg0].method581(Thread.currentThread());
	}

	@OriginalMember(owner = "client!wc", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt7077 || arg0 >= this.anInt7065) {
			return;
		}
		if (arg1 < this.anInt7088) {
			arg2 -= this.anInt7088 - arg1;
			arg1 = this.anInt7088;
		}
		if (arg1 + arg2 > this.anInt7082) {
			arg2 = this.anInt7082 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt7083;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray521[local40 + local54 * this.anInt7083] = arg3;
			}
			return;
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(116) int local116;
		if (arg4 == 1) {
			@Pc(97) int local97 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local103 = 0; local103 < arg2; local103++) {
				local111 = local40 + local103 * this.anInt7083;
				local116 = this.anIntArray521[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray521[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt7083;
				local111 = this.anIntArray521[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray521[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "()V")
	@Override
	public void method5698() {
		if (this.aCanvas7 == null || this.aClass1_Sub12_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas7.getGraphics();
			this.aClass1_Sub12_1.method2585(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas7.repaint();
		}
	}

	@OriginalMember(owner = "client!wc", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(2) int local2 = this.anInt7060;
		this.anInt7060 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)Lclient!n;")
	@Override
	public Class1_Sub4 method5726(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIIF)Lclient!ls;")
	@Override
	public Class1_Sub29 method5719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "(I)[I")
	private int[] method5743(@OriginalArg(0) int arg0) {
		@Pc(2) Class77 local2 = this.aClass77_61;
		@Pc(12) Class1_Sub21 local12;
		synchronized (this.aClass77_61) {
			local12 = (Class1_Sub21) this.aClass77_61.method1387((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_10.method5089(arg0)) {
					return null;
				}
				@Pc(32) Class25 local32 = super.anInterface4_10.method5090(arg0);
				@Pc(42) int local42 = local32.aBoolean54 || this.aBoolean617 ? 64 : 128;
				local12 = new Class1_Sub21(arg0, local42, super.anInterface4_10.method5086(local42, arg0, local42, 0.7F), local32.aBoolean61);
				this.aClass77_61.method1396(local12, (long) arg0);
			}
		}
		local12.aBoolean252 = true;
		return local12.method2100();
	}

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "(I)Z")
	public boolean method5744(@OriginalArg(0) int arg0) {
		return super.anInterface4_10.method5090(arg0).aBoolean56;
	}

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "(I)Z")
	public boolean method5745(@OriginalArg(0) int arg0) {
		return this.aBoolean617 || super.anInterface4_10.method5090(arg0).aBoolean54;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(IIIIII)Lclient!ud;")
	@Override
	public Class59 method5724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V")
	@Override
	public void method5674(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!wc", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat86;
	}

	@OriginalMember(owner = "client!wc", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt7088 || arg1 >= this.anInt7082) {
			return;
		}
		if (arg0 < this.anInt7077) {
			arg2 -= this.anInt7077 - arg0;
			arg0 = this.anInt7077;
		}
		if (arg0 + arg2 > this.anInt7065) {
			arg2 = this.anInt7065 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt7083;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray521[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray521[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray521[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray521[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray521[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!wc", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat87;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	@Override
	public void method5684(@OriginalArg(0) int arg0) {
		this.aClass33Array1[arg0].method581(null);
	}

	@OriginalMember(owner = "client!wc", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7085 = arg0;
		this.anInt7071 = arg1;
		this.anInt7080 = arg2;
		this.anInt7069 = arg3;
		this.method5737();
	}

	@OriginalMember(owner = "client!wc", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass34_Sub1_3.anInt2116 * arg0 + this.aClass34_Sub1_3.anInt2121 * arg1 + this.aClass34_Sub1_3.anInt2119 * arg2 >> 15) + this.aClass34_Sub1_3.anInt2120;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass34_Sub1_3.anInt2116 * arg3 + this.aClass34_Sub1_3.anInt2121 * arg4 + this.aClass34_Sub1_3.anInt2119 * arg5 >> 15) + this.aClass34_Sub1_3.anInt2120;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt7072 && local52 < this.anInt7072 || !(local23 <= this.anInt7061 || local52 <= this.anInt7061)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt7080 * ((this.aClass34_Sub1_3.anInt2118 * arg0 + this.aClass34_Sub1_3.anInt2123 * arg1 + this.aClass34_Sub1_3.anInt2122 * arg2 >> 15) + this.aClass34_Sub1_3.anInt2126) / local23;
		@Pc(133) int local133 = this.anInt7080 * ((this.aClass34_Sub1_3.anInt2118 * arg3 + this.aClass34_Sub1_3.anInt2123 * arg4 + this.aClass34_Sub1_3.anInt2122 * arg5 >> 15) + this.aClass34_Sub1_3.anInt2126) / local52;
		if (local104 < this.anInt7066 && local133 < this.anInt7066 || local104 > this.anInt7087 && local133 > this.anInt7087) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt7069 * ((this.aClass34_Sub1_3.anInt2124 * arg0 + this.aClass34_Sub1_3.anInt2127 * arg1 + this.aClass34_Sub1_3.anInt2125 * arg2 >> 15) + this.aClass34_Sub1_3.anInt2117) / local23;
			@Pc(209) int local209 = this.anInt7069 * ((this.aClass34_Sub1_3.anInt2124 * arg3 + this.aClass34_Sub1_3.anInt2127 * arg4 + this.aClass34_Sub1_3.anInt2125 * arg5 >> 15) + this.aClass34_Sub1_3.anInt2117) / local52;
			return (local180 >= this.anInt7064 || local209 >= this.anInt7064) && (local180 <= this.anInt7086 || local209 <= this.anInt7086);
		}
	}

	@OriginalMember(owner = "client!wc", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(2) int local2 = this.anInt7078;
		this.anInt7078 = 0;
		return local2;
	}
}
