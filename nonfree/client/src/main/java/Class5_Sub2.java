import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public abstract class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "Lclient!bda;")
	protected Class3_Sub6 aClass3_Sub6_3;

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas14;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	private int anInt9047;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
	public int anInt9048;

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
	public int anInt9051;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "[I")
	public int[] anIntArray762;

	@OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
	public int anInt9055;

	@OriginalMember(owner = "client!fk", name = "H", descriptor = "I")
	public int anInt9057;

	@OriginalMember(owner = "client!fk", name = "I", descriptor = "I")
	public int anInt9058;

	@OriginalMember(owner = "client!fk", name = "K", descriptor = "I")
	public int anInt9060;

	@OriginalMember(owner = "client!fk", name = "L", descriptor = "F")
	private float aFloat262;

	@OriginalMember(owner = "client!fk", name = "M", descriptor = "Z")
	public boolean aBoolean670;

	@OriginalMember(owner = "client!fk", name = "Q", descriptor = "Lclient!xa;")
	protected Class119 aClass119_32;

	@OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
	public int anInt9066;

	@OriginalMember(owner = "client!fk", name = "ab", descriptor = "F")
	private float aFloat263;

	@OriginalMember(owner = "client!fk", name = "bb", descriptor = "I")
	protected int anInt9070;

	@OriginalMember(owner = "client!fk", name = "cb", descriptor = "I")
	public int anInt9071;

	@OriginalMember(owner = "client!fk", name = "eb", descriptor = "I")
	public int anInt9073;

	@OriginalMember(owner = "client!fk", name = "gb", descriptor = "[Lclient!nw;")
	protected Class99[] aClass99Array3;

	@OriginalMember(owner = "client!fk", name = "ib", descriptor = "I")
	public int anInt9076;

	@OriginalMember(owner = "client!fk", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!fk", name = "nb", descriptor = "Lclient!xa;")
	private Class119 aClass119_33;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "Z")
	private boolean aBoolean667;

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "Z")
	private boolean aBoolean668;

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "Lclient!sd;")
	protected Class267 aClass267_44;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
	private int anInt9050;

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
	public int anInt9053;

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
	public int anInt9054;

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "I")
	public int anInt9056;

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
	public int anInt9049;

	@OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
	public int anInt9068;

	@OriginalMember(owner = "client!fk", name = "x", descriptor = "Z")
	public boolean aBoolean669;

	@OriginalMember(owner = "client!fk", name = "Z", descriptor = "I")
	public int anInt9069;

	@OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
	public int anInt9063;

	@OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
	private int anInt9067;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
	public int anInt9052;

	@OriginalMember(owner = "client!fk", name = "J", descriptor = "I")
	public int anInt9059;

	@OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
	public int anInt9064;

	@OriginalMember(owner = "client!fk", name = "hb", descriptor = "I")
	public int anInt9075;

	@OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
	private int anInt9061;

	@OriginalMember(owner = "client!fk", name = "jb", descriptor = "I")
	public int anInt9077;

	@OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
	public int anInt9065;

	@OriginalMember(owner = "client!fk", name = "db", descriptor = "I")
	private int anInt9072;

	@OriginalMember(owner = "client!fk", name = "fb", descriptor = "I")
	public int anInt9074;

	@OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
	public int anInt9062;

	@OriginalMember(owner = "client!fk", name = "kb", descriptor = "Z")
	private boolean aBoolean671;

	@OriginalMember(owner = "client!fk", name = "Y", descriptor = "Lclient!hp;")
	private final Class125 aClass125_67;

	@OriginalMember(owner = "client!fk", name = "mb", descriptor = "I")
	private int anInt9078;

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "Lclient!hp;")
	private final Class125 aClass125_66;

	@OriginalMember(owner = "client!fk", name = "P", descriptor = "Lclient!vm;")
	public Class205_Sub2 aClass205_Sub2_9;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!e;)V")
	private Class5_Sub2(@OriginalArg(0) Interface4 arg0) {
		super(arg0);
		this.aBoolean667 = false;
		this.aBoolean668 = false;
		this.aClass267_44 = new Class267(4);
		this.anInt9050 = 0;
		this.anInt9053 = 512;
		this.anInt9054 = 78642;
		this.anInt9056 = 512;
		this.anInt9049 = 0;
		this.anInt9068 = 0;
		this.aBoolean669 = false;
		this.anInt9069 = 0;
		this.anInt9063 = 0;
		this.anInt9067 = 0;
		this.anInt9052 = 45823;
		this.anInt9059 = 0;
		this.anInt9064 = 0;
		this.anInt9075 = 50;
		this.anInt9061 = 0;
		this.anInt9077 = 0;
		this.anInt9065 = 75518;
		this.anInt9072 = 3500;
		this.anInt9074 = 3500;
		this.anInt9062 = this.anInt9072 - 255;
		this.aBoolean671 = false;
		this.aClass125_67 = new Class125(16);
		this.anInt9078 = -1;
		this.aClass125_66 = new Class125(256);
		this.aClass205_Sub2_9 = new Class205_Sub2();
		this.method7474(1);
		this.method7438(0);
		Static340.method5406(false, true);
		this.aBoolean668 = true;
	}

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!e;)V")
	public Class5_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface4 arg1) {
		this(arg1);
		this.method7451(arg0);
		this.method7422(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "()Z")
	@Override
	public final boolean method7445() {
		return true;
	}

	@OriginalMember(owner = "client!fk", name = "p", descriptor = "()Lclient!q;")
	@Override
	public final Class205 method7448() {
		@Pc(3) Class99 local3 = this.method7497(Thread.currentThread());
		return local3.aClass205_Sub2_7;
	}

	@OriginalMember(owner = "client!fk", name = "s", descriptor = "()Z")
	public final boolean method7486() {
		return this.aBoolean667;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method7433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "()I")
	@Override
	public final int method7479() {
		return 0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method7410(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "()I")
	@Override
	public final int v() {
		return 0;
	}

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "()Z")
	@Override
	public final boolean method7452() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "KA", descriptor = "(IIII)[I")
	@Override
	public final int[] KA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt9076 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray762[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "(IIIII)V")
	@Override
	protected final void h(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt9069) {
			local8 = this.anInt9069;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt9049) {
			local21 = this.anInt9049;
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
				if (local91 < this.anInt9064) {
					local91 = this.anInt9064;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9068) {
					local102 = this.anInt9068;
				}
				local116 = local91 + local30 * this.anInt9076;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray762[local116++] = arg3;
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
				if (local91 < this.anInt9064) {
					local91 = this.anInt9064;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9068 - 1) {
					local102 = this.anInt9068 - 1;
				}
				local116 = local91 + local30 * this.anInt9076;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray762[local116++] = arg3;
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
				if (local102 < this.anInt9064) {
					local102 = this.anInt9064;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt9068) {
					local116 = this.anInt9068;
				}
				local118 = local102 + local30 * this.anInt9076;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray762[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray762[local118++] = local277 + local340;
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
				if (local102 < this.anInt9064) {
					local102 = this.anInt9064;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt9068 - 1) {
					local116 = this.anInt9068 - 1;
				}
				local118 = local102 + local30 * this.anInt9076;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray762[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray762[local118++] = local277 + local340;
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
				if (local91 < this.anInt9064) {
					local91 = this.anInt9064;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9068) {
					local102 = this.anInt9068;
				}
				local116 = local91 + local30 * this.anInt9076;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray762[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray762[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt9064) {
					local91 = this.anInt9064;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt9068 - 1) {
					local102 = this.anInt9068 - 1;
				}
				local116 = local91 + local30 * this.anInt9076;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray762[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray762[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "()Z")
	@Override
	public final boolean method7431() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!ba;Lclient!be;Lclient!q;Lclient!sda;I)V")
	@Override
	public final void method7464(@OriginalArg(0) Class2 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7 arg3, @OriginalArg(4) int arg4) {
		((Class2_Sub1) arg0).method5804(arg2, arg3, arg1, arg4);
	}

	@OriginalMember(owner = "client!fk", name = "JA", descriptor = "(I)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!be;)V")
	@Override
	public final void method7429(@OriginalArg(0) Class26 arg0) {
		@Pc(3) Class4_Sub3 local3 = arg0.aClass163_1.aClass4_Sub3_3;
		for (@Pc(6) Class4_Sub3 local6 = local3.aClass4_Sub3_10; local6 != local3; local6 = local6.aClass4_Sub3_10) {
			@Pc(10) Class4_Sub3_Sub1 local10 = (Class4_Sub3_Sub1) local6;
			@Pc(15) int local15 = local10.anInt5229 >> 12;
			@Pc(20) int local20 = local10.anInt5228 >> 12;
			@Pc(25) int local25 = local10.anInt5221 >> 12;
			@Pc(49) int local49 = this.aClass205_Sub2_9.anInt9005 + (this.aClass205_Sub2_9.anInt9004 * local15 + this.aClass205_Sub2_9.anInt9003 * local20 + this.aClass205_Sub2_9.anInt9008 * local25 >> 14);
			if (local49 >= this.anInt9075 && local49 <= this.anInt9062) {
				@Pc(90) int local90 = this.lb + this.anInt9056 * (this.aClass205_Sub2_9.anInt9000 + (this.aClass205_Sub2_9.anInt8998 * local15 + this.aClass205_Sub2_9.anInt9009 * local20 + this.aClass205_Sub2_9.anInt9006 * local25 >> 14)) / local49;
				@Pc(122) int local122 = this.anInt9058 + this.anInt9053 * (this.aClass205_Sub2_9.anInt8999 + (this.aClass205_Sub2_9.anInt9001 * local15 + this.aClass205_Sub2_9.anInt9007 * local20 + this.aClass205_Sub2_9.anInt9002 * local25 >> 14)) / local49;
				if (local90 >= this.anInt9064 && local90 <= this.anInt9068 && local122 >= this.anInt9069 && local122 <= this.anInt9049) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method7487(local10, local90, local122, (local10.anInt5219 * this.anInt9056 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(I)V")
	public abstract void method7454(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "()Z")
	@Override
	public final boolean method7423() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "LA", descriptor = "(IIII)V")
	@Override
	public final void LA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9077 = arg0;
		this.anInt9059 = arg1;
		this.anInt9063 = arg2;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!or;IIII)Lclient!ba;")
	public abstract Class2 method7443(@OriginalArg(0) Class222 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fk", name = "F", descriptor = "()V")
	@Override
	public final void F() {
		this.anInt9064 = 0;
		this.anInt9069 = 0;
		this.anInt9068 = this.anInt9076;
		this.anInt9049 = this.anInt9070;
		this.method7492();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([IIIII)Lclient!xa;")
	@Override
	public final Class119 method7483(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class119_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class119_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class119_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class119_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "([I)V")
	@Override
	public final void A(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt9064;
		arg0[1] = this.anInt9069;
		arg0[2] = this.anInt9068;
		arg0[3] = this.anInt9049;
	}

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "(I)V")
	@Override
	public final void D(@OriginalArg(0) int arg0) {
		this.C(0, 0, this.anInt9076, this.anInt9070, arg0, 0);
	}

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7466() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!nba;III)V")
	public final void method7487(@OriginalArg(0) Class4_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt5223;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.h(arg1, arg2, arg3, arg0.anInt5222, 1);
			return;
		}
		if (this.anInt9078 != local2) {
			@Pc(32) Class119 local32 = (Class119) this.aClass125_67.method3512((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method7488(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method7496(local2) ? 64 : 128;
				local32 = this.method7483(local38, local48, local48, local48);
				this.aClass125_67.method3519((long) local2, local32);
			}
			this.anInt9078 = local2;
			this.aClass119_33 = local32;
		}
		local8++;
		this.aClass119_33.KA(arg1 - arg3, arg2 - arg3, local8, local8, 0, arg0.anInt5222, 1);
	}

	@OriginalMember(owner = "client!fk", name = "o", descriptor = "()V")
	@Override
	protected final void method7447() {
		if (this.aBoolean668) {
			Static390.method5973(false, true);
			this.aBoolean668 = false;
		}
		this.aClass3_Sub6_3 = null;
		this.aCanvas14 = null;
		this.aClass267_44 = null;
		this.aBoolean667 = true;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIII)Lclient!dw;")
	@Override
	public final Class66 method7415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "()V")
	@Override
	public final void method7453() {
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!dw;)V")
	@Override
	public final void method7485(@OriginalArg(0) Class66 arg0) {
	}

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "()V")
	@Override
	public final void method7428() {
	}

	@OriginalMember(owner = "client!fk", name = "YA", descriptor = "(IFFFFF)V")
	@Override
	public final void YA(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt9052 = (int) (arg1 * 65535.0F);
		this.anInt9054 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt9071 = (int) (arg3 * 65535.0F / local26);
		this.anInt9055 = (int) (arg4 * 65535.0F / local26);
		this.anInt9051 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
	@Override
	public void method7438(@OriginalArg(0) int arg0) {
		this.aClass99Array3[arg0].method4757(Thread.currentThread());
	}

	@OriginalMember(owner = "client!fk", name = "ha", descriptor = "(F)V")
	@Override
	public final void ha(@OriginalArg(0) float arg0) {
		this.anInt9065 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7412(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "()Lclient!nl;")
	@Override
	public final Class207 method7430() {
		return new Class207(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "(I)V")
	public abstract void method7474(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fk", name = "ca", descriptor = "(IIII)V")
	@Override
	public final void ca(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt9076) {
			arg2 = this.anInt9076;
		}
		if (arg3 > this.anInt9070) {
			arg3 = this.anInt9070;
		}
		this.anInt9064 = arg0;
		this.anInt9068 = arg2;
		this.anInt9069 = arg1;
		this.anInt9049 = arg3;
		this.method7492();
	}

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "()V")
	@Override
	public void method7444() {
	}

	@OriginalMember(owner = "client!fk", name = "ka", descriptor = "(FF)V")
	@Override
	public final void ka(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat262 = arg0;
		this.aFloat263 = arg1;
		this.method7498();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	@Override
	public final void method7427(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt9047;
		for (@Pc(9) Object local9 = this.aClass125_66.method3518(); local9 != null; local9 = this.aClass125_66.method3514()) {
			@Pc(13) Class3_Sub41 local13 = (Class3_Sub41) local9;
			if (local13.aBoolean521) {
				local13.anInt7461 += local4;
				@Pc(27) int local27 = local13.anInt7461 / 20;
				if (local27 > 0) {
					@Pc(36) Class238 local36 = super.anInterface4_14.method6712(local13.anInt7460);
					local13.method6155(local36.aByte68 * local4 * 50 / 1000, local36.aByte69 * local4 * 50 / 1000);
					local13.anInt7461 -= local27 * 20;
				}
				local13.aBoolean521 = false;
			}
		}
		this.anInt9047 = arg0;
		this.aClass125_67.method3522(5);
		this.aClass125_66.method3522(5);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!cq;[Lclient!af;Z)Lclient!ta;")
	@Override
	public final Class59 method7414(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class9[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt478;
			local7[local11] = arg1[local11].anInt481;
			if (arg1[local11].aByteArray12 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class59_Sub4(this, arg0, arg1, local3, local7);
		} else {
			return new Class59_Sub2(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7421() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "ya", descriptor = "(IIIII)V")
	@Override
	public final void ya(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt9064 || arg0 >= this.anInt9068) {
			return;
		}
		if (arg1 < this.anInt9069) {
			arg2 -= this.anInt9069 - arg1;
			arg1 = this.anInt9069;
		}
		if (arg1 + arg2 > this.anInt9049) {
			arg2 = this.anInt9049 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt9076;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray762[local40 + local54 * this.anInt9076] = arg3;
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
				local111 = local40 + local103 * this.anInt9076;
				local116 = this.anIntArray762[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray762[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt9076;
				local111 = this.anIntArray762[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray762[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)[I")
	private int[] method7488(@OriginalArg(0) int arg0) {
		@Pc(2) Class125 local2 = this.aClass125_66;
		@Pc(12) Class3_Sub41 local12;
		synchronized (this.aClass125_66) {
			local12 = (Class3_Sub41) this.aClass125_66.method3512((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_14.method6708(arg0)) {
					return null;
				}
				@Pc(32) Class238 local32 = super.anInterface4_14.method6712(arg0);
				@Pc(42) int local42 = local32.aBoolean466 || this.aBoolean671 ? 64 : 128;
				local12 = new Class3_Sub41(arg0, local42, super.anInterface4_14.method6707(local42, arg0, local42, 0.7F), local32.aBoolean468);
				this.aClass125_66.method3519((long) arg0, local12);
			}
		}
		local12.aBoolean521 = true;
		return local12.method6154();
	}

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "(I)Lclient!i;")
	@Override
	public final Class3_Sub22 method7470(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I[Lclient!oj;)V")
	@Override
	public final void method7460(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub30[] arg1) {
	}

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "(IIII)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.lb = arg0;
		this.anInt9058 = arg1;
		this.anInt9056 = arg2;
		this.anInt9053 = arg3;
		this.method7492();
	}

	@OriginalMember(owner = "client!fk", name = "X", descriptor = "(III)V")
	@Override
	public final void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9059 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt9059 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt9059 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt9059 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt9059 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean670 = false;
		} else {
			this.aBoolean670 = true;
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7424(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas14 == arg0) {
			this.method7422(null);
		}
		@Pc(15) Class3_Sub6 local15 = (Class3_Sub6) this.aClass267_44.method6644((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7820();
		}
	}

	@OriginalMember(owner = "client!fk", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7465() {
		return true;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!dw;Lclient!dw;FLclient!dw;)Lclient!dw;")
	@Override
	public final Class66 method7450(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class66 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class66 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!fk", name = "FA", descriptor = "(IIIIII)Z")
	@Override
	public final boolean FA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass205_Sub2_9.anInt9004 * arg0 + this.aClass205_Sub2_9.anInt9003 * arg1 + this.aClass205_Sub2_9.anInt9008 * arg2 >> 14) + this.aClass205_Sub2_9.anInt9005;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass205_Sub2_9.anInt9004 * arg3 + this.aClass205_Sub2_9.anInt9003 * arg4 + this.aClass205_Sub2_9.anInt9008 * arg5 >> 14) + this.aClass205_Sub2_9.anInt9005;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt9075 && local52 < this.anInt9075 || !(local23 <= this.anInt9072 || local52 <= this.anInt9072)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt9056 * ((this.aClass205_Sub2_9.anInt8998 * arg0 + this.aClass205_Sub2_9.anInt9009 * arg1 + this.aClass205_Sub2_9.anInt9006 * arg2 >> 14) + this.aClass205_Sub2_9.anInt9000) / local23;
		@Pc(133) int local133 = this.anInt9056 * ((this.aClass205_Sub2_9.anInt8998 * arg3 + this.aClass205_Sub2_9.anInt9009 * arg4 + this.aClass205_Sub2_9.anInt9006 * arg5 >> 14) + this.aClass205_Sub2_9.anInt9000) / local52;
		if (local104 < this.anInt9057 && local133 < this.anInt9057 || local104 > this.anInt9066 && local133 > this.anInt9066) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt9053 * ((this.aClass205_Sub2_9.anInt9001 * arg0 + this.aClass205_Sub2_9.anInt9007 * arg1 + this.aClass205_Sub2_9.anInt9002 * arg2 >> 14) + this.aClass205_Sub2_9.anInt8999) / local23;
			@Pc(209) int local209 = this.anInt9053 * ((this.aClass205_Sub2_9.anInt9001 * arg3 + this.aClass205_Sub2_9.anInt9007 * arg4 + this.aClass205_Sub2_9.anInt9002 * arg5 >> 14) + this.aClass205_Sub2_9.anInt8999) / local52;
			return (local180 >= this.anInt9060 || local209 >= this.anInt9060) && (local180 <= this.anInt9073 || local209 <= this.anInt9073);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[I[I)Lclient!fa;")
	@Override
	public final Class10 method7481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class10_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!q;)V")
	@Override
	public final void method7469(@OriginalArg(0) Class205 arg0) {
		this.aClass205_Sub2_9 = (Class205_Sub2) arg0;
	}

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7439() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "(IIIIII)V")
	@Override
	public final void C(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt9064) {
			arg2 -= this.anInt9064 - arg0;
			arg0 = this.anInt9064;
		}
		if (arg1 < this.anInt9069) {
			arg3 -= this.anInt9069 - arg1;
			arg1 = this.anInt9069;
		}
		if (arg0 + arg2 > this.anInt9068) {
			arg2 = this.anInt9068 - arg0;
		}
		if (arg1 + arg3 > this.anInt9049) {
			arg3 = this.anInt9049 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt9068 || arg1 > this.anInt9049) {
			return;
		}
		@Pc(67) int local67 = this.anInt9076 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt9076;
		@Pc(78) int local78 = arg4 >>> 24;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(101) int local101;
		if (arg5 != 0 && (arg5 != 1 || local78 != 255)) {
			@Pc(217) int local217;
			if (arg5 == 1) {
				@Pc(201) int local201 = ((arg4 & 0xFF00FF) * local78 >> 8 & 0xFF00FF) + (((arg4 & 0xFF00FF00) >>> 8) * local78 & 0xFF00FF00);
				local90 = 256 - local78;
				for (local94 = 0; local94 < arg3; local94++) {
					for (local101 = -arg2; local101 < 0; local101++) {
						local217 = this.anIntArray762[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray762[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray762[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray762[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray762[arg2] = arg4;
					arg2++;
					this.anIntArray762[arg2] = arg4;
					arg2++;
					this.anIntArray762[arg2] = arg4;
					arg2++;
					this.anIntArray762[arg2] = arg4;
					arg2++;
					this.anIntArray762[arg2] = arg4;
					arg2++;
					this.anIntArray762[arg2] = arg4;
					arg2++;
					this.anIntArray762[arg2] = arg4;
					arg2++;
					this.anIntArray762[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray762[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7426() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7451(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class3_Sub6 local8 = (Class3_Sub6) this.aClass267_44.method6644((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static9.method6181(arg0);
			this.aClass267_44.method6640(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.e(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.e(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
			@Pc(309) int local309;
			@Pc(204) int local204;
			if (arg2 > arg3) {
				arg1 <<= 0x10;
				arg1 += 32768;
				@Pc(94) int local94 = arg3 << 16;
				local104 = (int) Math.floor((double) local94 / (double) arg2 + 0.5D);
				arg2 += arg0;
				if (arg0 < this.anInt9064) {
					arg1 += local104 * (this.anInt9064 - arg0);
					arg0 = this.anInt9064;
				}
				if (arg2 >= this.anInt9068) {
					arg2 = this.anInt9068 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt9069 && local150 < this.anInt9049) {
							this.anIntArray762[arg0 + local150 * this.anInt9076] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt9069 && local213 < this.anInt9049) {
							local228 = arg0 + local213 * this.anInt9076;
							local233 = this.anIntArray762[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray762[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt9069 && local150 < this.anInt9049) {
							local213 = arg0 + local150 * this.anInt9076;
							local228 = this.anIntArray762[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray762[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt9069) {
					arg0 += local104 * (this.anInt9069 - arg1);
					arg1 = this.anInt9069;
				}
				if (arg3 >= this.anInt9049) {
					arg3 = this.anInt9049 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt9064 && local150 < this.anInt9068) {
							this.anIntArray762[local150 + arg1 * this.anInt9076] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt9064 && local213 < this.anInt9068) {
							local228 = local213 + arg1 * this.anInt9076;
							local233 = this.anIntArray762[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray762[local213 + arg1 * this.anInt9076] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt9064 && local150 < this.anInt9068) {
							local213 = local150 + arg1 * this.anInt9076;
							local228 = this.anIntArray762[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray762[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.ya(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.ya(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lclient!i;)V")
	@Override
	public final void method7456(@OriginalArg(0) Class3_Sub22 arg0) {
	}

	@OriginalMember(owner = "client!fk", name = "na", descriptor = "(III[I)V")
	@Override
	public final void na(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass205_Sub2_9.anInt9005 + (this.aClass205_Sub2_9.anInt9004 * arg0 + this.aClass205_Sub2_9.anInt9003 * arg1 + this.aClass205_Sub2_9.anInt9008 * arg2 >> 14);
		if (local23 < this.anInt9075 || local23 > this.anInt9072) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt9056 * (this.aClass205_Sub2_9.anInt9000 + (this.aClass205_Sub2_9.anInt8998 * arg0 + this.aClass205_Sub2_9.anInt9009 * arg1 + this.aClass205_Sub2_9.anInt9006 * arg2 >> 14)) / local23;
		@Pc(102) int local102 = this.anInt9053 * (this.aClass205_Sub2_9.anInt8999 + (this.aClass205_Sub2_9.anInt9001 * arg0 + this.aClass205_Sub2_9.anInt9007 * arg1 + this.aClass205_Sub2_9.anInt9002 * arg2 >> 14)) / local23;
		if (local73 >= this.anInt9057 && local73 <= this.anInt9066 && local102 >= this.anInt9060 && local102 <= this.anInt9073) {
			arg3[0] = local73 - this.anInt9057;
			arg3[1] = local102 - this.anInt9060;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7446(@OriginalArg(0) boolean arg0) {
		this.aBoolean671 = arg0;
		this.aClass125_66.method3521();
	}

	@OriginalMember(owner = "client!fk", name = "SA", descriptor = "()I")
	@Override
	public final int SA() {
		@Pc(2) int local2 = this.anInt9067;
		this.anInt9067 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([Lclient!ba;Lclient!be;Lclient!q;[Lclient!sda;I)V")
	public abstract void method7478(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) Class205 arg2, @OriginalArg(3) Class4_Sub7[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method7436();

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "()Z")
	@Override
	public final boolean method7480() {
		return true;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method7417(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas14 == null || this.aClass3_Sub6_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas14.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt9076 && local21.y <= this.anInt9070 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass3_Sub6_3.method2206(local21.height, local21.width, local21.x, local21.y, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas14.repaint();
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!fk", name = "sa", descriptor = "(II)V")
	@Override
	public final void sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9075 = arg0;
		this.anInt9072 = arg1;
		this.anInt9062 = this.anInt9072 - 255;
		this.method7498();
	}

	@OriginalMember(owner = "client!fk", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return this.anInt9075;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)I")
	@Override
	public final int method7418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!fk", name = "j", descriptor = "(I)[I")
	public final int[] method7489(@OriginalArg(0) int arg0) {
		@Pc(2) Class125 local2 = this.aClass125_66;
		@Pc(12) Class3_Sub41 local12;
		synchronized (this.aClass125_66) {
			local12 = (Class3_Sub41) this.aClass125_66.method3512((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_14.method6708(arg0)) {
					return null;
				}
				@Pc(32) Class238 local32 = super.anInterface4_14.method6712(arg0);
				@Pc(42) int local42 = local32.aBoolean466 || this.aBoolean671 ? 64 : 128;
				local12 = new Class3_Sub41(arg0, local42, super.anInterface4_14.method6711(local42, 0.7F, arg0, local42, true), local32.aBoolean468);
				this.aClass125_66.method3519((long) arg0, local12);
			}
		}
		local12.aBoolean521 = true;
		return local12.method6154();
	}

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "(I)Z")
	public final boolean method7490(@OriginalArg(0) int arg0) {
		return super.anInterface4_14.method6708(arg0);
	}

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "(I)I")
	public final int method7491(@OriginalArg(0) int arg0) {
		return super.anInterface4_14.method6712(arg0).aShort111 & 0xFFFF;
	}

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "()Z")
	@Override
	public final boolean method7461() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "(I)V")
	@Override
	public final void method7463(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "()V")
	@Override
	public final void method7420() {
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(II)I")
	@Override
	public final int method7435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "()V")
	protected abstract void method7492();

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "(I)Z")
	public final boolean method7493(@OriginalArg(0) int arg0) {
		return super.anInterface4_14.method6712(arg0).aBoolean464;
	}

	@OriginalMember(owner = "client!fk", name = "q", descriptor = "()V")
	@Override
	public final void method7449() throws Exception_Sub1 {
		if (this.aCanvas14 == null || this.aClass3_Sub6_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas14.getGraphics();
			this.aClass3_Sub6_3.method2204(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas14.repaint();
		}
	}

	@OriginalMember(owner = "client!fk", name = "G", descriptor = "()V")
	protected final void method7494() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt9048; local1++) {
			this.aClass99Array3[local1].method4756();
		}
		this.F();
	}

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "()Z")
	@Override
	public final boolean method7441() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!af;Z)Lclient!xa;")
	@Override
	public final Class119 method7425(@OriginalArg(0) Class9 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray90;
		@Pc(5) byte[] local5 = arg0.aByteArray13;
		@Pc(8) int local8 = arg0.anInt478;
		@Pc(11) int local11 = arg0.anInt481;
		@Pc(76) Class119_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray12 == null) {
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
			local76 = new Class119_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray12;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class119_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class119_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.EA(arg0.anInt476, arg0.anInt477, arg0.anInt480, arg0.anInt479);
		return local76;
	}

	@OriginalMember(owner = "client!fk", name = "IA", descriptor = "()I")
	@Override
	public final int IA() {
		return this.anInt9072;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIIIII)V")
	public final void method7495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface4_14.method6712(arg5).aBoolean461) {
			this.h(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt9078 != arg5) {
			@Pc(26) Class119 local26 = (Class119) this.aClass125_67.method3512((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method7488(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method7496(arg5) ? 64 : 128;
				local26 = this.method7483(local32, local43, local43, local43);
				this.aClass125_67.method3519((long) arg5, local26);
			}
			this.anInt9078 = arg5;
			this.aClass119_33 = local26;
		}
		this.aClass119_33.KA(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "()V")
	@Override
	public final void k() {
		this.anInt9059 = this.anInt9061;
		this.aBoolean669 = false;
	}

	@OriginalMember(owner = "client!fk", name = "ma", descriptor = "(IIIIII[BII)V")
	@Override
	public final void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt9076;
		@Pc(35) int local35 = this.anInt9076 - arg2;
		if (arg1 + arg3 > this.anInt9049) {
			arg3 -= arg1 + arg3 - this.anInt9049;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt9069) {
			local59 = this.anInt9069 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt9076;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt9068) {
			local59 = arg0 + arg2 - this.anInt9068;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt9064) {
			local59 = this.anInt9064 - arg0;
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
						this.anIntArray762[local30++] = arg4;
					} else {
						this.anIntArray762[local30++] = arg5;
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
					local245 = this.anIntArray762[local30];
					this.anIntArray762[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray762[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray762[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!fk", name = "aa", descriptor = "()I")
	@Override
	public final int aa() {
		@Pc(2) int local2 = this.anInt9050;
		this.anInt9050 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7442(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "()Z")
	@Override
	public final boolean method7473() {
		return true;
	}

	@OriginalMember(owner = "client!fk", name = "AA", descriptor = "(IIII)V")
	@Override
	public final void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9061 = this.anInt9059;
		this.anInt9077 = arg0;
		this.anInt9059 = arg1;
		this.anInt9063 = arg2;
		this.aBoolean669 = true;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7422(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "(I)Z")
	public final boolean method7496(@OriginalArg(0) int arg0) {
		return this.aBoolean671 || super.anInterface4_14.method6712(arg0).aBoolean466;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIF)Lclient!oj;")
	@Override
	public final Class3_Sub30 method7475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "()V")
	@Override
	public final void method7413() {
	}

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "()V")
	@Override
	public final void method7471() {
		this.aClass125_66.method3521();
		this.aClass125_67.method3521();
	}

	@OriginalMember(owner = "client!fk", name = "L", descriptor = "(ILclient!fa;II)V")
	@Override
	public final void L(@OriginalArg(0) int arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class10_Sub1 local2 = (Class10_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray93;
		@Pc(8) int[] local8 = local2.anIntArray94;
		@Pc(20) int local20;
		if (this.anInt9049 < arg3 + local5.length) {
			local20 = this.anInt9049 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt9069 > arg3) {
			local33 = this.anInt9069 - arg3;
			arg3 = this.anInt9069;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt9076;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt9064 > local58) {
				local62 -= this.anInt9064 - local58;
				local58 = this.anInt9064;
			}
			if (this.anInt9068 < local58 + local62) {
				local62 = this.anInt9068 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray762[local58++] = arg0;
			}
			local49 += this.anInt9076;
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(IIIIII)V")
	@Override
	public final void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.e(arg0, arg1, arg2, arg4, arg5);
		this.e(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.ya(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.ya(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(II[[I[[IIII)Lclient!d;")
	public abstract Class52 method7432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIZ)Lclient!xa;")
	@Override
	public final Class119 method7457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt9076 + arg0;
		@Pc(16) int local16 = this.anInt9076 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray762[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class119_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class119_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "([Lclient!ba;Lclient!q;[Lclient!sda;I)V")
	public abstract void method7468(@OriginalArg(0) Class2[] arg0, @OriginalArg(1) Class205 arg1, @OriginalArg(2) Class4_Sub7[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "()Z")
	@Override
	public final boolean method7472() {
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIIIILclient!fa;II)V")
	@Override
	public final void method7467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class10_Sub1 local2 = (Class10_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray93;
		@Pc(8) int[] local8 = local2.anIntArray94;
		@Pc(17) int local17 = this.anInt9069 > arg7 ? this.anInt9069 : arg7;
		@Pc(32) int local32 = this.anInt9049 < arg7 + local5.length ? this.anInt9049 : arg7 + local5.length;
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
					if (local129 >= this.anInt9064 && local129 < this.anInt9068 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray762[local129 + arg1 * this.anInt9076] = arg4;
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
					if (local133 >= this.anInt9064 && local133 < this.anInt9068 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt9076;
						local248 = this.anIntArray762[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray762[local133 + arg1 * this.anInt9076] = local201 + local584;
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
		if (arg0 < this.anInt9064) {
			arg1 += local83 * (this.anInt9064 - arg0);
			arg0 = this.anInt9064;
		}
		if (arg2 >= this.anInt9068) {
			arg2 = this.anInt9068 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray762[arg0 + local129 * this.anInt9076] = arg4;
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
					local243 = arg0 + local133 * this.anInt9076;
					local248 = this.anIntArray762[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray762[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7455(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!nw;")
	public abstract Class99 method7497(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "()Z")
	public abstract boolean method7462();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "()Lclient!q;")
	@Override
	public final Class205 method7409() {
		return new Class205_Sub2();
	}

	@OriginalMember(owner = "client!fk", name = "H", descriptor = "()V")
	private void method7498() {
		if (this.aFloat263 == 0.0F) {
			this.anInt9074 = this.anInt9072;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt9072;
		@Pc(12) float local12 = (float) this.anInt9075;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat262 / (this.aFloat263 + this.aFloat262);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat263;
		this.anInt9074 = (int) (((float) this.anInt9072 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!fk", name = "Q", descriptor = "(IIII)V")
	@Override
	public final void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9064 < arg0) {
			this.anInt9064 = arg0;
		}
		if (this.anInt9069 < arg1) {
			this.anInt9069 = arg1;
		}
		if (this.anInt9068 > arg2) {
			this.anInt9068 = arg2;
		}
		if (this.anInt9049 > arg3) {
			this.anInt9049 = arg3;
		}
		this.method7492();
	}

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt9069 || arg1 >= this.anInt9049) {
			return;
		}
		if (arg0 < this.anInt9064) {
			arg2 -= this.anInt9064 - arg0;
			arg0 = this.anInt9064;
		}
		if (arg0 + arg2 > this.anInt9068) {
			arg2 = this.anInt9068 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt9076;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray762[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray762[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray762[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray762[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray762[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
