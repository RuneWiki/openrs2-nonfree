import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public abstract class Class62_Sub2 extends Class62 {

	@OriginalMember(owner = "client!vda", name = "t", descriptor = "I")
	private int anInt8666;

	@OriginalMember(owner = "client!vda", name = "u", descriptor = "Lclient!nt;")
	protected Class5_Sub34 aClass5_Sub34_3;

	@OriginalMember(owner = "client!vda", name = "v", descriptor = "Z")
	private boolean aBoolean628;

	@OriginalMember(owner = "client!vda", name = "w", descriptor = "Z")
	private boolean aBoolean629;

	@OriginalMember(owner = "client!vda", name = "x", descriptor = "Lclient!cb;")
	protected Class42 aClass42_39;

	@OriginalMember(owner = "client!vda", name = "y", descriptor = "Ljava/awt/Canvas;")
	protected Canvas aCanvas15;

	@OriginalMember(owner = "client!vda", name = "z", descriptor = "I")
	public int anInt8667;

	@OriginalMember(owner = "client!vda", name = "A", descriptor = "I")
	public int anInt8668;

	@OriginalMember(owner = "client!vda", name = "B", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_68;

	@OriginalMember(owner = "client!vda", name = "C", descriptor = "F")
	private float aFloat355;

	@OriginalMember(owner = "client!vda", name = "D", descriptor = "I")
	private int anInt8669;

	@OriginalMember(owner = "client!vda", name = "E", descriptor = "I")
	public int anInt8670;

	@OriginalMember(owner = "client!vda", name = "F", descriptor = "I")
	public int anInt8671;

	@OriginalMember(owner = "client!vda", name = "G", descriptor = "I")
	public int anInt8672;

	@OriginalMember(owner = "client!vda", name = "H", descriptor = "I")
	public int anInt8673;

	@OriginalMember(owner = "client!vda", name = "I", descriptor = "I")
	public int anInt8674;

	@OriginalMember(owner = "client!vda", name = "J", descriptor = "I")
	public int anInt8675;

	@OriginalMember(owner = "client!vda", name = "K", descriptor = "Z")
	private boolean aBoolean630;

	@OriginalMember(owner = "client!vda", name = "L", descriptor = "Lclient!uaa;")
	private final Class288 aClass288_69;

	@OriginalMember(owner = "client!vda", name = "M", descriptor = "I")
	public int anInt8676;

	@OriginalMember(owner = "client!vda", name = "N", descriptor = "I")
	public int anInt8677;

	@OriginalMember(owner = "client!vda", name = "O", descriptor = "I")
	private int anInt8678;

	@OriginalMember(owner = "client!vda", name = "P", descriptor = "I")
	public int anInt8679;

	@OriginalMember(owner = "client!vda", name = "Q", descriptor = "Z")
	public boolean aBoolean631;

	@OriginalMember(owner = "client!vda", name = "R", descriptor = "I")
	public int anInt8680;

	@OriginalMember(owner = "client!vda", name = "S", descriptor = "I")
	private int anInt8681;

	@OriginalMember(owner = "client!vda", name = "T", descriptor = "I")
	public int anInt8682;

	@OriginalMember(owner = "client!vda", name = "U", descriptor = "I")
	protected int anInt8683;

	@OriginalMember(owner = "client!vda", name = "V", descriptor = "Z")
	public boolean aBoolean632;

	@OriginalMember(owner = "client!vda", name = "W", descriptor = "[Lclient!kw;")
	protected Class178[] aClass178Array3;

	@OriginalMember(owner = "client!vda", name = "X", descriptor = "I")
	public int anInt8684;

	@OriginalMember(owner = "client!vda", name = "Y", descriptor = "I")
	public int anInt8685;

	@OriginalMember(owner = "client!vda", name = "Z", descriptor = "I")
	public int anInt8686;

	@OriginalMember(owner = "client!vda", name = "ab", descriptor = "I")
	private int anInt8687;

	@OriginalMember(owner = "client!vda", name = "bb", descriptor = "I")
	public int anInt8688;

	@OriginalMember(owner = "client!vda", name = "cb", descriptor = "I")
	public int anInt8689;

	@OriginalMember(owner = "client!vda", name = "db", descriptor = "I")
	public int anInt8690;

	@OriginalMember(owner = "client!vda", name = "eb", descriptor = "F")
	private float aFloat356;

	@OriginalMember(owner = "client!vda", name = "fb", descriptor = "I")
	public int anInt8691;

	@OriginalMember(owner = "client!vda", name = "gb", descriptor = "I")
	public int anInt8692;

	@OriginalMember(owner = "client!vda", name = "hb", descriptor = "I")
	public int anInt8693;

	@OriginalMember(owner = "client!vda", name = "ib", descriptor = "I")
	public int anInt8694;

	@OriginalMember(owner = "client!vda", name = "jb", descriptor = "I")
	public int anInt8695;

	@OriginalMember(owner = "client!vda", name = "kb", descriptor = "Lclient!kv;")
	public Class78_Sub2 aClass78_Sub2_8;

	@OriginalMember(owner = "client!vda", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!vda", name = "mb", descriptor = "[I")
	public int[] anIntArray672;

	@OriginalMember(owner = "client!vda", name = "nb", descriptor = "I")
	public int anInt8696;

	@OriginalMember(owner = "client!vda", name = "ob", descriptor = "Lclient!ha;")
	protected Class25 aClass25_27;

	@OriginalMember(owner = "client!vda", name = "pb", descriptor = "I")
	private int anInt8697;

	@OriginalMember(owner = "client!vda", name = "qb", descriptor = "Lclient!ha;")
	private Class25 aClass25_28;

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lclient!n;)V")
	public Class62_Sub2(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Interface8 arg1) {
		this(arg1);
		this.method7026(arg0);
		this.method7015(arg0);
	}

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!n;)V")
	private Class62_Sub2(@OriginalArg(0) Interface8 arg0) {
		super(arg0);
		this.aBoolean628 = false;
		this.aBoolean629 = false;
		this.aClass42_39 = new Class42(4);
		this.anInt8672 = 0;
		this.anInt8673 = 0;
		this.anInt8667 = 0;
		this.anInt8675 = 0;
		this.anInt8677 = 50;
		this.aBoolean631 = false;
		this.anInt8669 = 3500;
		this.anInt8679 = 45823;
		this.anInt8684 = 0;
		this.aBoolean630 = false;
		this.anInt8678 = 0;
		this.anInt8685 = 0;
		this.anInt8689 = 512;
		this.anInt8668 = 75518;
		this.anInt8690 = 3500;
		this.anInt8687 = 0;
		this.anInt8674 = 512;
		this.anInt8682 = this.anInt8669 - 255;
		this.anInt8695 = 0;
		this.anInt8671 = 78642;
		this.anInt8681 = 0;
		this.aClass288_69 = new Class288(16);
		this.anInt8697 = -1;
		this.aClass288_68 = new Class288(20);
		this.aClass78_Sub2_8 = new Class78_Sub2();
		this.method6997(1);
		this.method7001(0);
		Static265.method4417(false, true);
		this.aBoolean628 = true;
	}

	@OriginalMember(owner = "client!vda", name = "B", descriptor = "(IIIIII)Z")
	@Override
	public final boolean B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass78_Sub2_8.anInt5278 * arg0 + this.aClass78_Sub2_8.anInt5280 * arg1 + this.aClass78_Sub2_8.anInt5279 * arg2 >> 15) + this.aClass78_Sub2_8.anInt5277;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass78_Sub2_8.anInt5278 * arg3 + this.aClass78_Sub2_8.anInt5280 * arg4 + this.aClass78_Sub2_8.anInt5279 * arg5 >> 15) + this.aClass78_Sub2_8.anInt5277;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt8677 && local52 < this.anInt8677 || !(local23 <= this.anInt8669 || local52 <= this.anInt8669)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt8674 * ((this.aClass78_Sub2_8.anInt5271 * arg0 + this.aClass78_Sub2_8.anInt5273 * arg1 + this.aClass78_Sub2_8.anInt5272 * arg2 >> 15) + this.aClass78_Sub2_8.anInt5275) / local23;
		@Pc(133) int local133 = this.anInt8674 * ((this.aClass78_Sub2_8.anInt5271 * arg3 + this.aClass78_Sub2_8.anInt5273 * arg4 + this.aClass78_Sub2_8.anInt5272 * arg5 >> 15) + this.aClass78_Sub2_8.anInt5275) / local52;
		if (local104 < this.lb && local133 < this.lb || local104 > this.anInt8696 && local133 > this.anInt8696) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt8689 * ((this.aClass78_Sub2_8.anInt5281 * arg0 + this.aClass78_Sub2_8.anInt5270 * arg1 + this.aClass78_Sub2_8.anInt5274 * arg2 >> 15) + this.aClass78_Sub2_8.anInt5276) / local23;
			@Pc(209) int local209 = this.anInt8689 * ((this.aClass78_Sub2_8.anInt5281 * arg3 + this.aClass78_Sub2_8.anInt5270 * arg4 + this.aClass78_Sub2_8.anInt5274 * arg5 >> 15) + this.aClass78_Sub2_8.anInt5276) / local52;
			return (local180 >= this.anInt8693 || local209 >= this.anInt8693) && (local180 <= this.anInt8692 || local209 <= this.anInt8692);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	@Override
	public final void method6996(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vda", name = "D", descriptor = "()V")
	@Override
	public final void method7065() {
	}

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "(I)Z")
	public final boolean method7069(@OriginalArg(0) int arg0) {
		return this.aBoolean630 || super.anInterface8_145.method7237(arg0).aBoolean558;
	}

	@OriginalMember(owner = "client!vda", name = "N", descriptor = "(IIII)V")
	@Override
	public final void N(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt8670) {
			arg2 = this.anInt8670;
		}
		if (arg3 > this.anInt8683) {
			arg3 = this.anInt8683;
		}
		this.anInt8673 = arg0;
		this.anInt8685 = arg2;
		this.anInt8695 = arg1;
		this.anInt8672 = arg3;
		this.method7072();
	}

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "()Z")
	@Override
	public final boolean method7033() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIII)V")
	public abstract void method7045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!vda", name = "ta", descriptor = "(II)V")
	@Override
	public final void ta(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8677 = arg0;
		this.anInt8669 = arg1;
		this.anInt8682 = this.anInt8669 - 255;
		this.method7070();
	}

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "()Z")
	@Override
	public final boolean method7005() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "v", descriptor = "(IIII)[I")
	@Override
	public final int[] v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt8670 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray672[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIZ)Lclient!ha;")
	@Override
	public final Class25 method7003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt8670 + arg0;
		@Pc(16) int local16 = this.anInt8670 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray672[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class25_Sub1_Sub2(this, local4, arg2, arg3);
		} else {
			return new Class25_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "()V")
	@Override
	public void method6999() {
	}

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "(IIIIII)V")
	@Override
	public final void f(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt8673) {
			arg2 -= this.anInt8673 - arg0;
			arg0 = this.anInt8673;
		}
		if (arg1 < this.anInt8695) {
			arg3 -= this.anInt8695 - arg1;
			arg1 = this.anInt8695;
		}
		if (arg0 + arg2 > this.anInt8685) {
			arg2 = this.anInt8685 - arg0;
		}
		if (arg1 + arg3 > this.anInt8672) {
			arg3 = this.anInt8672 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt8685 || arg1 > this.anInt8672) {
			return;
		}
		@Pc(67) int local67 = this.anInt8670 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt8670;
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
						local217 = this.anIntArray672[local74];
						local217 = ((local217 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + (((local217 & 0xFF00FF00) >>> 8) * local90 & 0xFF00FF00);
						this.anIntArray672[local74++] = local201 + local217;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray672[local74];
						local217 = arg4 + local101;
						@Pc(284) int local284 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(294) int local294 = (local284 & 0x1000100) + (local217 - local284 & 0x10000);
						this.anIntArray672[local74++] = local217 - local294 | local294 - (local294 >>> 8);
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
					this.anIntArray672[arg2] = arg4;
					arg2++;
					this.anIntArray672[arg2] = arg4;
					arg2++;
					this.anIntArray672[arg2] = arg4;
					arg2++;
					this.anIntArray672[arg2] = arg4;
					arg2++;
					this.anIntArray672[arg2] = arg4;
					arg2++;
					this.anIntArray672[arg2] = arg4;
					arg2++;
					this.anIntArray672[arg2] = arg4;
					arg2++;
					this.anIntArray672[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray672[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(Z)V")
	@Override
	public final void method7027(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "(I)Lclient!u;")
	@Override
	public final Class5_Sub29 method7010(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II[I[I)Lclient!pa;")
	@Override
	public final Class87 method7006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class87_Sub3(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vda", name = "w", descriptor = "()V")
	private void method7070() {
		if (this.aFloat355 == 0.0F) {
			this.anInt8690 = this.anInt8669;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt8669;
		@Pc(12) float local12 = (float) this.anInt8677;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat356 / (this.aFloat355 + this.aFloat356);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat355;
		this.anInt8690 = (int) (((float) this.anInt8669 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!vda", name = "JA", descriptor = "(IIII)V")
	@Override
	public final void JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8667 = arg0;
		this.anInt8684 = arg1;
		this.anInt8675 = arg2;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!kw;")
	public abstract Class178 method7071(@OriginalArg(0) Runnable arg0);

	@OriginalMember(owner = "client!vda", name = "L", descriptor = "(I)V")
	@Override
	public final void L(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "([IIIII)Lclient!ha;")
	@Override
	public final Class25 method7021(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class25_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class25_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class25_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3) : new Class25_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!vda", name = "z", descriptor = "()Z")
	@Override
	public final boolean method7050() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "U", descriptor = "()I")
	@Override
	public final int U() {
		return 0;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7015(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(IIIIII)Lclient!kk;")
	@Override
	public final Class92 method7046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "()Z")
	@Override
	public final boolean method7028() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "E", descriptor = "()V")
	protected abstract void method7072();

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "(I)V")
	public abstract void method7060(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "([Lclient!r;Lclient!sh;Lclient!m;[Lclient!paa;I)V")
	public abstract void method7008(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6[] arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!ld;IIII)Lclient!r;")
	public abstract Class36 method7012(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!vda", name = "Z", descriptor = "(I)V")
	@Override
	public final void Z(@OriginalArg(0) int arg0) {
		this.f(0, 0, this.anInt8670, this.anInt8683, arg0, 0);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "()Lclient!m;")
	@Override
	public final Class78 method6994() {
		@Pc(3) Class178 local3 = this.method7071(Thread.currentThread());
		return local3.aClass78_Sub2_7;
	}

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "()V")
	@Override
	public final void method7030() throws Exception_Sub1 {
		if (this.aCanvas15 == null || this.aClass5_Sub34_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas15.getGraphics();
			this.aClass5_Sub34_3.method6471(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas15.repaint();
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!rl;[Lclient!fba;Z)Lclient!ra;")
	@Override
	public final Class13 method7054(@OriginalArg(0) Class256 arg0, @OriginalArg(1) Class96[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		@Pc(9) boolean local9 = false;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2722;
			local7[local11] = arg1[local11].anInt2718;
			if (arg1[local11].aByteArray41 != null) {
				local9 = true;
			}
		}
		if (local9) {
			return new Class13_Sub1(this, arg0, arg1, local3, local7);
		} else {
			return new Class13_Sub4(this, arg0, arg1, local3, local7);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIIIII)V")
	public final void method7073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface8_145.method7237(arg5).aBoolean566) {
			this.A(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt8697 != arg5) {
			@Pc(26) Class25 local26 = (Class25) this.aClass288_69.method6745((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method7075(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method7069(arg5) ? 64 : 128;
				local26 = this.method7021(local32, local43, local43, local43);
				this.aClass288_69.method6746(local26, (long) arg5);
			}
			this.anInt8697 = arg5;
			this.aClass25_28 = local26;
		}
		this.aClass25_28.ra(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!vda", name = "p", descriptor = "()Z")
	@Override
	public final boolean method7031() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "(I)Z")
	public final boolean method7074(@OriginalArg(0) int arg0) {
		return super.anInterface8_145.method7237(arg0).aBoolean561;
	}

	@OriginalMember(owner = "client!vda", name = "ba", descriptor = "()I")
	@Override
	public final int ba() {
		@Pc(2) int local2 = this.anInt8678;
		this.anInt8678 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(FFF)V")
	@Override
	public final void method7041(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!vda", name = "s", descriptor = "()V")
	@Override
	public final void method7035() {
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public final void method7055(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (this.aCanvas15 == null || this.aClass5_Sub34_3 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas15.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt8670 && local21.y <= this.anInt8683 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass5_Sub34_3.method6473(local21.y, local21.width, local21.x, local14, local21.height);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas15.repaint();
		}
	}

	@OriginalMember(owner = "client!vda", name = "u", descriptor = "()V")
	@Override
	public final void method7039() {
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(IIIIII)V")
	@Override
	public final void method7036(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.UA(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.UA(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt8673) {
					arg1 += local104 * (this.anInt8673 - arg0);
					arg0 = this.anInt8673;
				}
				if (arg2 >= this.anInt8685) {
					arg2 = this.anInt8685 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8695 && local150 < this.anInt8672) {
							this.anIntArray672[arg0 + local150 * this.anInt8670] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt8695 && local213 < this.anInt8672) {
							local228 = arg0 + local213 * this.anInt8670;
							local233 = this.anIntArray672[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray672[local228] = local204 + local233;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 2) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt8695 && local150 < this.anInt8672) {
							local213 = arg0 + local150 * this.anInt8670;
							local228 = this.anIntArray672[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							local228 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray672[local213] = local233 - local228 | local228 - (local228 >>> 8);
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
				if (arg1 < this.anInt8695) {
					arg0 += local104 * (this.anInt8695 - arg1);
					arg1 = this.anInt8695;
				}
				if (arg3 >= this.anInt8672) {
					arg3 = this.anInt8672 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8673 && local150 < this.anInt8685) {
							this.anIntArray672[local150 + arg1 * this.anInt8670] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt8673 && local213 < this.anInt8685) {
							local228 = local213 + arg1 * this.anInt8670;
							local233 = this.anIntArray672[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray672[local213 + arg1 * this.anInt8670] = local204 + local233;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 2) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt8673 && local150 < this.anInt8685) {
							local213 = local150 + arg1 * this.anInt8670;
							local228 = this.anIntArray672[local213];
							local233 = arg4 + local228;
							local309 = (arg4 & 0xFF00FF) + (local228 & 0xFF00FF);
							@Pc(587) int local587 = (local309 & 0x1000100) + (local233 - local309 & 0x10000);
							this.anIntArray672[local213] = local233 - local587 | local587 - (local587 >>> 8);
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.e(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.e(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!kk;)V")
	@Override
	public final void method7067(@OriginalArg(0) Class92 arg0) {
	}

	@OriginalMember(owner = "client!vda", name = "E", descriptor = "(III)V")
	@Override
	public final void E(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8684 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt8684 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt8684 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt8684 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt8684 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean632 = false;
		} else {
			this.aBoolean632 = true;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIIIIII)V")
	public abstract void method6995();

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "(IIII)V")
	@Override
	public final void q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8687 = this.anInt8684;
		this.anInt8667 = arg0;
		this.anInt8684 = arg1;
		this.anInt8675 = arg2;
		this.aBoolean631 = true;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(II)I")
	@Override
	public final int method7024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Z)V")
	@Override
	public final void method7022(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "()V")
	@Override
	public final void method7004() {
	}

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "(I)[I")
	private int[] method7075(@OriginalArg(0) int arg0) {
		@Pc(2) Class288 local2 = this.aClass288_68;
		@Pc(12) Class5_Sub45 local12;
		synchronized (this.aClass288_68) {
			local12 = (Class5_Sub45) this.aClass288_68.method6745((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_145.method7236(arg0)) {
					return null;
				}
				@Pc(32) Class271 local32 = super.anInterface8_145.method7237(arg0);
				@Pc(42) int local42 = local32.aBoolean558 || this.aBoolean630 ? 64 : 128;
				local12 = new Class5_Sub45(arg0, local42, super.anInterface8_145.method7232(0.7F, local42, arg0, local42), local32.aBoolean564);
				this.aClass288_68.method6746(local12, (long) arg0);
			}
		}
		local12.aBoolean593 = true;
		return local12.method6659();
	}

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "()V")
	@Override
	public final void n() {
		this.anInt8673 = 0;
		this.anInt8695 = 0;
		this.anInt8685 = this.anInt8670;
		this.anInt8672 = this.anInt8683;
		this.method7072();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II)I")
	@Override
	public final int method7017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!vda", name = "UA", descriptor = "(IIIII)V")
	@Override
	public final void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt8695 || arg1 >= this.anInt8672) {
			return;
		}
		if (arg0 < this.anInt8673) {
			arg2 -= this.anInt8673 - arg0;
			arg0 = this.anInt8673;
		}
		if (arg0 + arg2 > this.anInt8685) {
			arg2 = this.anInt8685 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8670;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray672[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray672[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray672[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray672[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray672[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V")
	@Override
	public void method7001(@OriginalArg(0) int arg0) {
		this.aClass178Array3[arg0].method5645(Thread.currentThread());
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIF)Lclient!uca;")
	@Override
	public final Class5_Sub10 method6993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!vda", name = "xa", descriptor = "()V")
	@Override
	public final void xa() {
		this.anInt8684 = this.anInt8687;
		this.aBoolean631 = false;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	public abstract void method6997(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!vda", name = "ra", descriptor = "()F")
	@Override
	public final float ra() {
		return this.aFloat355;
	}

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "(I)I")
	public final int method7076(@OriginalArg(0) int arg0) {
		return super.anInterface8_145.method7237(arg0).aShort100 & 0xFFFF;
	}

	@OriginalMember(owner = "client!vda", name = "F", descriptor = "()Z")
	public final boolean method7077() {
		return this.aBoolean629;
	}

	@OriginalMember(owner = "client!vda", name = "YA", descriptor = "()I")
	@Override
	public final int YA() {
		@Pc(2) int local2 = this.anInt8681;
		this.anInt8681 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!vda", name = "l", descriptor = "()V")
	@Override
	public final void method7025() {
		this.aClass288_68.method6744();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(II[[I[[IIII)Lclient!sa;")
	public abstract Class131 method7051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "([I)V")
	@Override
	public final void d(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt8673;
		arg0[1] = this.anInt8695;
		arg0[2] = this.anInt8685;
		arg0[3] = this.anInt8672;
	}

	@OriginalMember(owner = "client!vda", name = "CA", descriptor = "()I")
	@Override
	public final int CA() {
		return this.anInt8669;
	}

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	public abstract void method7038(@OriginalArg(0) Canvas arg0);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!m;)V")
	@Override
	public final void method7068(@OriginalArg(0) Class78 arg0) {
		this.aClass78_Sub2_8 = (Class78_Sub2) arg0;
	}

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "(I)V")
	@Override
	public final void method7048(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt8666;
		for (@Pc(9) Object local9 = this.aClass288_68.method6743(); local9 != null; local9 = this.aClass288_68.method6733()) {
			@Pc(13) Class5_Sub45 local13 = (Class5_Sub45) local9;
			if (local13.aBoolean593) {
				local13.anInt8252 += local4;
				@Pc(27) int local27 = local13.anInt8252 / 20;
				if (local27 > 0) {
					@Pc(36) Class271 local36 = super.anInterface8_145.method7237(local13.anInt8250);
					local13.method6660(local36.aByte82 * local4 * 50 / 1000, local36.aByte81 * local4 * 50 / 1000);
					local13.anInt8252 -= local27 * 20;
				}
				local13.aBoolean593 = false;
			}
		}
		this.anInt8666 = arg0;
		this.aClass288_69.method6735(5);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "([Lclient!r;Lclient!m;[Lclient!paa;I)V")
	public abstract void method7019(@OriginalArg(0) Class36[] arg0, @OriginalArg(1) Class78 arg1, @OriginalArg(2) Class30_Sub6[] arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!vda", name = "G", descriptor = "(ILclient!pa;II)V")
	@Override
	public final void G(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class87_Sub3 local2 = (Class87_Sub3) arg1;
		@Pc(5) int[] local5 = local2.anIntArray509;
		@Pc(8) int[] local8 = local2.anIntArray508;
		@Pc(20) int local20;
		if (this.anInt8672 < arg3 + local5.length) {
			local20 = this.anInt8672 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt8695 > arg3) {
			local33 = this.anInt8695 - arg3;
			arg3 = this.anInt8695;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt8670;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt8673 > local58) {
				local62 -= this.anInt8673 - local58;
				local58 = this.anInt8673;
			}
			if (this.anInt8685 < local58 + local62) {
				local62 = this.anInt8685 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray672[local58++] = arg0;
			}
			local49 += this.anInt8670;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!tl;III)V")
	public final void method7078(@OriginalArg(0) Class30_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt2968;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.A(arg1, arg2, arg3, arg0.anInt2962, 1);
			return;
		}
		if (this.anInt8697 != local2) {
			@Pc(32) Class25 local32 = (Class25) this.aClass288_69.method6745((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method7075(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method7069(local2) ? 64 : 128;
				local32 = this.method7021(local38, local48, local48, local48);
				this.aClass288_69.method6746(local32, (long) local2);
			}
			this.anInt8697 = local2;
			this.aClass25_28 = local32;
		}
		local8++;
		this.aClass25_28.ra(arg1 - arg3, arg2 - arg3, local8, local8, 0, arg0.anInt2962, 1);
	}

	@OriginalMember(owner = "client!vda", name = "j", descriptor = "()Z")
	@Override
	public final boolean method7020() {
		return true;
	}

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "()Z")
	@Override
	public final boolean method7007() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "n", descriptor = "(I)Z")
	public final boolean method7079(@OriginalArg(0) int arg0) {
		return super.anInterface8_145.method7236(arg0);
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(Z)V")
	@Override
	public final void method7058(@OriginalArg(0) boolean arg0) {
		this.aBoolean630 = arg0;
		this.aClass288_68.method6744();
	}

	@OriginalMember(owner = "client!vda", name = "e", descriptor = "(IIIII)V")
	@Override
	public final void e(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt8673 || arg0 >= this.anInt8685) {
			return;
		}
		if (arg1 < this.anInt8695) {
			arg2 -= this.anInt8695 - arg1;
			arg1 = this.anInt8695;
		}
		if (arg1 + arg2 > this.anInt8672) {
			arg2 = this.anInt8672 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt8670;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray672[local40 + local54 * this.anInt8670] = arg3;
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
				local111 = local40 + local103 * this.anInt8670;
				local116 = this.anIntArray672[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray672[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt8670;
				local111 = this.anIntArray672[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray672[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vda", name = "IA", descriptor = "(III[I)V")
	@Override
	public final void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass78_Sub2_8.anInt5277 + (this.aClass78_Sub2_8.anInt5278 * arg0 + this.aClass78_Sub2_8.anInt5280 * arg1 + this.aClass78_Sub2_8.anInt5279 * arg2 >> 15);
		if (local23 < this.anInt8677 || local23 > this.anInt8669) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt8674 * (this.aClass78_Sub2_8.anInt5275 + (this.aClass78_Sub2_8.anInt5271 * arg0 + this.aClass78_Sub2_8.anInt5273 * arg1 + this.aClass78_Sub2_8.anInt5272 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt8689 * (this.aClass78_Sub2_8.anInt5276 + (this.aClass78_Sub2_8.anInt5281 * arg0 + this.aClass78_Sub2_8.anInt5270 * arg1 + this.aClass78_Sub2_8.anInt5274 * arg2 >> 15)) / local23;
		if (local73 >= this.lb && local73 <= this.anInt8696 && local102 >= this.anInt8693 && local102 <= this.anInt8692) {
			arg3[0] = local73 - this.lb;
			arg3[1] = local102 - this.anInt8693;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!sh;)V")
	@Override
	public final void method7002(@OriginalArg(0) Class267 arg0) {
		@Pc(3) Class30_Sub2 local3 = arg0.aClass161_1.aClass30_Sub2_7;
		for (@Pc(6) Class30_Sub2 local6 = local3.aClass30_Sub2_9; local6 != local3; local6 = local6.aClass30_Sub2_9) {
			@Pc(10) Class30_Sub2_Sub1 local10 = (Class30_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt2966 >> 12;
			@Pc(20) int local20 = local10.anInt2967 >> 12;
			@Pc(25) int local25 = local10.anInt2969 >> 12;
			@Pc(49) int local49 = this.aClass78_Sub2_8.anInt5277 + (this.aClass78_Sub2_8.anInt5278 * local15 + this.aClass78_Sub2_8.anInt5280 * local20 + this.aClass78_Sub2_8.anInt5279 * local25 >> 15);
			if (local49 >= this.anInt8677 && local49 <= this.anInt8682) {
				@Pc(90) int local90 = this.anInt8676 + this.anInt8674 * (this.aClass78_Sub2_8.anInt5275 + (this.aClass78_Sub2_8.anInt5271 * local15 + this.aClass78_Sub2_8.anInt5273 * local20 + this.aClass78_Sub2_8.anInt5272 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt8694 + this.anInt8689 * (this.aClass78_Sub2_8.anInt5276 + (this.aClass78_Sub2_8.anInt5281 * local15 + this.aClass78_Sub2_8.anInt5270 * local20 + this.aClass78_Sub2_8.anInt5274 * local25 >> 15)) / local49;
				if (local90 >= this.anInt8673 && local90 <= this.anInt8685 && local122 >= this.anInt8695 && local122 <= this.anInt8672) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method7078(local10, local90, local122, (local10.anInt2963 * this.anInt8674 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "B", descriptor = "()Z")
	public abstract boolean method7062();

	@OriginalMember(owner = "client!vda", name = "o", descriptor = "(I)[I")
	public final int[] method7080(@OriginalArg(0) int arg0) {
		@Pc(2) Class288 local2 = this.aClass288_68;
		@Pc(12) Class5_Sub45 local12;
		synchronized (this.aClass288_68) {
			local12 = (Class5_Sub45) this.aClass288_68.method6745((long) arg0);
			if (local12 == null) {
				if (!super.anInterface8_145.method7236(arg0)) {
					return null;
				}
				@Pc(32) Class271 local32 = super.anInterface8_145.method7237(arg0);
				@Pc(42) int local42 = local32.aBoolean558 || this.aBoolean630 ? 64 : 128;
				local12 = new Class5_Sub45(arg0, local42, super.anInterface8_145.method7234(local42, local42, true, arg0, 0.7F), local32.aBoolean564);
				this.aClass288_68.method6746(local12, (long) arg0);
			}
		}
		local12.aBoolean593 = true;
		return local12.method6659();
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "()I")
	@Override
	public final int c() {
		return this.anInt8677;
	}

	@OriginalMember(owner = "client!vda", name = "y", descriptor = "()Z")
	@Override
	public final boolean method7049() {
		return true;
	}

	@OriginalMember(owner = "client!vda", name = "A", descriptor = "()Z")
	@Override
	public final boolean method7053() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "(IFFFFF)V")
	@Override
	public final void m(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt8679 = (int) (arg1 * 65535.0F);
		this.anInt8671 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt8688 = (int) (arg3 * 65535.0F / local26);
		this.anInt8680 = (int) (arg4 * 65535.0F / local26);
		this.anInt8691 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!kk;Lclient!kk;FLclient!kk;)Lclient!kk;")
	@Override
	public final Class92 method7052(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class92 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class92 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!vda", name = "A", descriptor = "(IIIII)V")
	@Override
	protected final void A(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt8695) {
			local8 = this.anInt8695;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt8672) {
			local21 = this.anInt8672;
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
				if (local91 < this.anInt8673) {
					local91 = this.anInt8673;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8685) {
					local102 = this.anInt8685;
				}
				local116 = local91 + local30 * this.anInt8670;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray672[local116++] = arg3;
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
				if (local91 < this.anInt8673) {
					local91 = this.anInt8673;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8685 - 1) {
					local102 = this.anInt8685 - 1;
				}
				local116 = local91 + local30 * this.anInt8670;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray672[local116++] = arg3;
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
				if (local102 < this.anInt8673) {
					local102 = this.anInt8673;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt8685) {
					local116 = this.anInt8685;
				}
				local118 = local102 + local30 * this.anInt8670;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray672[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray672[local118++] = local277 + local340;
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
				if (local102 < this.anInt8673) {
					local102 = this.anInt8673;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt8685 - 1) {
					local116 = this.anInt8685 - 1;
				}
				local118 = local102 + local30 * this.anInt8670;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray672[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray672[local118++] = local277 + local340;
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
				if (local91 < this.anInt8673) {
					local91 = this.anInt8673;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8685) {
					local102 = this.anInt8685;
				}
				local116 = local91 + local30 * this.anInt8670;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray672[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray672[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt8673) {
					local91 = this.anInt8673;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt8685 - 1) {
					local102 = this.anInt8685 - 1;
				}
				local116 = local91 + local30 * this.anInt8670;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray672[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray672[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(IIII)V")
	@Override
	public final void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8676 = arg0;
		this.anInt8694 = arg1;
		this.anInt8674 = arg2;
		this.anInt8689 = arg3;
		this.method7072();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public final void method6991(@OriginalArg(0) Class5_Sub29 arg0) {
	}

	@OriginalMember(owner = "client!vda", name = "P", descriptor = "()F")
	@Override
	public final float P() {
		return this.aFloat356;
	}

	@OriginalMember(owner = "client!vda", name = "za", descriptor = "(IIIIII[BII)V")
	@Override
	public final void za(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt8670;
		@Pc(35) int local35 = this.anInt8670 - arg2;
		if (arg1 + arg3 > this.anInt8672) {
			arg3 -= arg1 + arg3 - this.anInt8672;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt8695) {
			local59 = this.anInt8695 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt8670;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt8685) {
			local59 = arg0 + arg2 - this.anInt8685;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt8673) {
			local59 = this.anInt8673 - arg0;
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
						this.anIntArray672[local30++] = arg4;
					} else {
						this.anIntArray672[local30++] = arg5;
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
					local245 = this.anIntArray672[local30];
					this.anIntArray672[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray672[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray672[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!vda", name = "C", descriptor = "()Z")
	@Override
	public final boolean method7063() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "d", descriptor = "()Z")
	@Override
	public final boolean method7000() {
		return true;
	}

	@OriginalMember(owner = "client!vda", name = "t", descriptor = "()V")
	@Override
	protected final void method7037() {
		if (this.aBoolean628) {
			Static135.method2550(true, false);
			this.aBoolean628 = false;
		}
		this.aClass5_Sub34_3 = null;
		this.aCanvas15 = null;
		this.aClass42_39 = null;
		this.aBoolean629 = true;
	}

	@OriginalMember(owner = "client!vda", name = "v", descriptor = "()Z")
	@Override
	public final boolean method7044() {
		return true;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!r;Lclient!sh;Lclient!m;Lclient!paa;I)V")
	@Override
	public final void method7066(@OriginalArg(0) Class36 arg0, @OriginalArg(1) Class267 arg1, @OriginalArg(2) Class78 arg2, @OriginalArg(3) Class30_Sub6 arg3) {
		((Class36_Sub1) arg0).method7383(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!vda", name = "h", descriptor = "()Lclient!m;")
	@Override
	public final Class78 method7011() {
		return new Class78_Sub2();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIII)V")
	@Override
	public final void method7009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.UA(arg0, arg1, arg2, arg4, arg5);
		this.UA(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.e(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.e(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!vda", name = "i", descriptor = "()Lclient!dp;")
	@Override
	public final Class68 method7016() {
		return new Class68(0, "Pure Java", 1, "CPU", 0L);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I[Lclient!uca;)V")
	@Override
	public final void method7059(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub10[] arg1) {
	}

	@OriginalMember(owner = "client!vda", name = "G", descriptor = "()V")
	protected final void method7081() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt8686; local1++) {
			this.aClass178Array3[local1].method5644();
		}
		this.n();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIII)V")
	@Override
	public final void method7018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!fba;Z)Lclient!ha;")
	@Override
	public final Class25 method6998(@OriginalArg(0) Class96 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray229;
		@Pc(5) byte[] local5 = arg0.aByteArray42;
		@Pc(8) int local8 = arg0.anInt2722;
		@Pc(11) int local11 = arg0.anInt2718;
		@Pc(76) Class25_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray41 == null) {
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
			local76 = new Class25_Sub1_Sub3(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray41;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						@Pc(156) int local156 = local2[local5[local32 + local34] & 0xFF];
						local20[local32 + local34] = local156 == 0 ? 0 : local156 | 0xFF000000;
					}
				}
				local76 = new Class25_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class25_Sub1_Sub2(this, local20, local8, local11);
			}
		}
		local76.KA(arg0.anInt2719, arg0.anInt2720, arg0.anInt2723, arg0.anInt2721);
		return local76;
	}

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7026(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class5_Sub34 local8 = (Class5_Sub34) this.aClass42_39.method1109((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static345.method5369(arg0);
			this.aClass42_39.method1106((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!vda", name = "F", descriptor = "(IIII)V")
	@Override
	public final void F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt8673 < arg0) {
			this.anInt8673 = arg0;
		}
		if (this.anInt8695 < arg1) {
			this.anInt8695 = arg1;
		}
		if (this.anInt8685 > arg2) {
			this.anInt8685 = arg2;
		}
		if (this.anInt8672 > arg3) {
			this.anInt8672 = arg3;
		}
		this.method7072();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIIIIILclient!pa;II)V")
	@Override
	public final void method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class87 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class87_Sub3 local2 = (Class87_Sub3) arg5;
		@Pc(5) int[] local5 = local2.anIntArray509;
		@Pc(8) int[] local8 = local2.anIntArray508;
		@Pc(17) int local17 = this.anInt8695 > arg7 ? this.anInt8695 : arg7;
		@Pc(32) int local32 = this.anInt8672 < arg7 + local5.length ? this.anInt8672 : arg7 + local5.length;
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
					if (local129 >= this.anInt8673 && local129 < this.anInt8685 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray672[local129 + arg1 * this.anInt8670] = arg4;
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
					if (local133 >= this.anInt8673 && local133 < this.anInt8685 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt8670;
						local248 = this.anIntArray672[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray672[local133 + arg1 * this.anInt8670] = local201 + local584;
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
		if (arg0 < this.anInt8673) {
			arg1 += local83 * (this.anInt8673 - arg0);
			arg0 = this.anInt8673;
		}
		if (arg2 >= this.anInt8685) {
			arg2 = this.anInt8685 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray672[arg0 + local129 * this.anInt8670] = arg4;
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
					local243 = arg0 + local133 * this.anInt8670;
					local248 = this.anIntArray672[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray672[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public final void method7014(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas15 == arg0) {
			this.method7015(null);
		}
		@Pc(15) Class5_Sub34 local15 = (Class5_Sub34) this.aClass42_39.method1109((long) arg0.hashCode());
		if (local15 != null) {
			local15.method7425();
		}
	}

	@OriginalMember(owner = "client!vda", name = "M", descriptor = "(F)V")
	@Override
	public final void M(@OriginalArg(0) float arg0) {
		this.anInt8668 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!vda", name = "x", descriptor = "()Z")
	@Override
	public final boolean method7047() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "k", descriptor = "()Z")
	@Override
	public final boolean method7023() {
		return false;
	}

	@OriginalMember(owner = "client!vda", name = "la", descriptor = "(FF)V")
	@Override
	public final void la(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat356 = arg0;
		this.aFloat355 = arg1;
		this.method7070();
	}

	@OriginalMember(owner = "client!vda", name = "r", descriptor = "()I")
	@Override
	public final int method7034() {
		return 0;
	}
}
