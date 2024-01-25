import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class106_Sub1 extends Class106 {

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "Z")
	private boolean aBoolean195;

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "Lclient!bu;")
	private Class38 aClass38_14;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "Lclient!cd;")
	private Class1_Sub9 aClass1_Sub9_1;

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "Z")
	private boolean aBoolean196;

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
	private int anInt3285;

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas15;

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
	public int anInt3286;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
	public int anInt3287;

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "Lclient!md;")
	public Class40_Sub1 aClass40_Sub1_3;

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
	public int anInt3288;

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "[Lclient!bo;")
	private Class33[] aClass33Array1;

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
	public int anInt3289;

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "Lclient!fr;")
	private final Class91 aClass91_46;

	@OriginalMember(owner = "client!hj", name = "F", descriptor = "F")
	private float aFloat30;

	@OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
	public int anInt3290;

	@OriginalMember(owner = "client!hj", name = "H", descriptor = "I")
	public int anInt3291;

	@OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
	public int anInt3292;

	@OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
	private int anInt3293;

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
	public int anInt3294;

	@OriginalMember(owner = "client!hj", name = "L", descriptor = "I")
	private int anInt3295;

	@OriginalMember(owner = "client!hj", name = "M", descriptor = "Z")
	public boolean aBoolean197;

	@OriginalMember(owner = "client!hj", name = "N", descriptor = "I")
	private int anInt3296;

	@OriginalMember(owner = "client!hj", name = "O", descriptor = "I")
	public int anInt3297;

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
	public int anInt3298;

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
	public int anInt3299;

	@OriginalMember(owner = "client!hj", name = "R", descriptor = "I")
	public int anInt3300;

	@OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
	public int anInt3301;

	@OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
	private int anInt3302;

	@OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
	public int anInt3303;

	@OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
	public int anInt3304;

	@OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
	public int anInt3305;

	@OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
	public int anInt3306;

	@OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
	public int anInt3307;

	@OriginalMember(owner = "client!hj", name = "Z", descriptor = "Z")
	public boolean aBoolean198;

	@OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
	private int anInt3308;

	@OriginalMember(owner = "client!hj", name = "bb", descriptor = "[I")
	public int[] anIntArray341;

	@OriginalMember(owner = "client!hj", name = "cb", descriptor = "I")
	public int anInt3309;

	@OriginalMember(owner = "client!hj", name = "db", descriptor = "Z")
	private boolean aBoolean199;

	@OriginalMember(owner = "client!hj", name = "eb", descriptor = "I")
	public int anInt3310;

	@OriginalMember(owner = "client!hj", name = "fb", descriptor = "Lclient!o;")
	private Class137 aClass137_11;

	@OriginalMember(owner = "client!hj", name = "gb", descriptor = "I")
	public int anInt3311;

	@OriginalMember(owner = "client!hj", name = "hb", descriptor = "I")
	public int anInt3312;

	@OriginalMember(owner = "client!hj", name = "ib", descriptor = "I")
	public int anInt3313;

	@OriginalMember(owner = "client!hj", name = "jb", descriptor = "I")
	public int anInt3314;

	@OriginalMember(owner = "client!hj", name = "kb", descriptor = "Lclient!fr;")
	private final Class91 aClass91_47;

	@OriginalMember(owner = "client!hj", name = "lb", descriptor = "I")
	public int lb;

	@OriginalMember(owner = "client!hj", name = "mb", descriptor = "F")
	private float aFloat31;

	@OriginalMember(owner = "client!hj", name = "nb", descriptor = "I")
	public int anInt3315;

	@OriginalMember(owner = "client!hj", name = "ob", descriptor = "Lclient!o;")
	private Class137 aClass137_12;

	@OriginalMember(owner = "client!hj", name = "pb", descriptor = "I")
	private int anInt3316;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!l;)V")
	public Class106_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface7 arg2) {
		this(arg0, arg2);
		this.method5965(arg1);
		this.method5920(arg1);
	}

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(ILclient!l;)V")
	private Class106_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface7 arg1) {
		super(arg0, arg1);
		this.aBoolean195 = false;
		this.aBoolean196 = false;
		this.aClass38_14 = new Class38(4);
		this.anInt3287 = 0;
		this.anInt3291 = 0;
		this.anInt3296 = 0;
		this.anInt3297 = 0;
		this.anInt3292 = 78642;
		this.anInt3295 = 0;
		this.anInt3308 = 3500;
		this.anInt3289 = 512;
		this.anInt3294 = 0;
		this.aBoolean199 = false;
		this.anInt3293 = 0;
		this.anInt3300 = 50;
		this.anInt3311 = 512;
		this.aBoolean197 = false;
		this.anInt3309 = this.anInt3308 - 255;
		this.anInt3288 = 0;
		this.anInt3307 = 3500;
		this.lb = 75518;
		this.anInt3312 = 45823;
		this.anInt3305 = 0;
		this.anInt3315 = 0;
		this.aClass91_46 = new Class91(16);
		this.anInt3316 = -1;
		this.aClass91_47 = new Class91(20);
		this.aClass40_Sub1_3 = new Class40_Sub1();
		this.method5911(1);
		this.method5978(0);
		Static53.method996(false, true);
		this.aBoolean196 = true;
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "()Z")
	@Override
	public boolean method5927() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "()Z")
	@Override
	public boolean method5980() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "p", descriptor = "()V")
	private void method2579() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3306; local1++) {
			this.aClass33Array1[local1].method727();
		}
		this.va();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V")
	@Override
	public void method5971(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "sa", descriptor = "(IIII)[I")
	@Override
	public int[] sa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt3304 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.anIntArray341[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ug;Lclient!ug;FLclient!ug;)Lclient!ug;")
	@Override
	public Class86 method5972(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class86 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class86 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[[I[[IIII)Lclient!ya;")
	@Override
	public Class96 method5979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class96_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "()Z")
	@Override
	public boolean method5942() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "()I")
	@Override
	public int r() {
		return this.anInt3308;
	}

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "()Z")
	@Override
	public boolean method5960() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "()V")
	private void method2580() {
		this.anInt3286 = this.anInt3294 - this.anInt3290;
		this.anInt3303 = this.anInt3288 - this.anInt3290;
		this.anInt3301 = this.anInt3305 - this.anInt3313;
		this.anInt3298 = this.anInt3315 - this.anInt3313;
		for (@Pc(29) int local29 = 0; local29 < this.anInt3306; local29++) {
			@Pc(36) Class218 local36 = this.aClass33Array1[local29].aClass218_1;
			local36.anInt6531 = this.anInt3290 - this.anInt3294;
			local36.anInt6529 = this.anInt3313 - this.anInt3305;
			local36.anInt6530 = this.anInt3288 - this.anInt3294;
			local36.anInt6533 = this.anInt3315 - this.anInt3305;
		}
		@Pc(78) int local78 = this.anInt3305 * this.anInt3304 + this.anInt3294;
		for (@Pc(81) int local81 = this.anInt3305; local81 < this.anInt3315; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt3306; local84++) {
				this.aClass33Array1[local84].aClass218_1.anIntArray607[local81 - this.anInt3305] = local78;
			}
			local78 += this.anInt3304;
		}
	}

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "(III[I)V")
	@Override
	public void v(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass40_Sub1_3.anInt4750 + (this.aClass40_Sub1_3.anInt4751 * arg0 + this.aClass40_Sub1_3.anInt4754 * arg1 + this.aClass40_Sub1_3.anInt4745 * arg2 >> 15);
		if (local23 < this.anInt3300 || local23 > this.anInt3308) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt3289 * (this.aClass40_Sub1_3.anInt4753 + (this.aClass40_Sub1_3.anInt4744 * arg0 + this.aClass40_Sub1_3.anInt4749 * arg1 + this.aClass40_Sub1_3.anInt4747 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt3311 * (this.aClass40_Sub1_3.anInt4746 + (this.aClass40_Sub1_3.anInt4752 * arg0 + this.aClass40_Sub1_3.anInt4743 * arg1 + this.aClass40_Sub1_3.anInt4748 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt3286 && local73 <= this.anInt3303 && local102 >= this.anInt3301 && local102 <= this.anInt3298) {
			arg3[0] = local73 - this.anInt3286;
			arg3[1] = local102 - this.anInt3301;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "()Lclient!c;")
	@Override
	public Class40 method5918() {
		@Pc(3) Class33 local3 = this.method2586(Thread.currentThread());
		return local3.aClass40_Sub1_1;
	}

	@OriginalMember(owner = "client!hj", name = "D", descriptor = "()Z")
	public boolean method2581() {
		return this.aBoolean195;
	}

	@OriginalMember(owner = "client!hj", name = "q", descriptor = "()Z")
	@Override
	public boolean method5949() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "pa", descriptor = "()I")
	@Override
	public int pa() {
		return 0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method5914() {
		@Pc(3) Class33 local3 = this.method2586(Thread.currentThread());
		@Pc(6) Class218 local6 = local3.aClass218_1;
		local6.aBoolean413 = false;
		local6.aBoolean413 = false;
		local6.anInt6528 = 0;
		local6.aBoolean411 = true;
		local6.method4979(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean413 = true;
	}

	@OriginalMember(owner = "client!hj", name = "ra", descriptor = "(ILclient!ta;II)V")
	@Override
	public void ra(@OriginalArg(0) int arg0, @OriginalArg(1) Class24 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class24_Sub1 local2 = (Class24_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray44;
		@Pc(8) int[] local8 = local2.anIntArray46;
		@Pc(20) int local20;
		if (this.anInt3315 < arg3 + local5.length) {
			local20 = this.anInt3315 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt3305 > arg3) {
			local33 = this.anInt3305 - arg3;
			arg3 = this.anInt3305;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt3304;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt3294 > local58) {
				local62 -= this.anInt3294 - local58;
				local58 = this.anInt3294;
			}
			if (this.anInt3288 < local58 + local62) {
				local62 = this.anInt3288 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.anIntArray341[local58++] = arg0;
			}
			local49 += this.anInt3304;
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V")
	@Override
	public void a(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3291 = arg0;
		this.anInt3297 = arg1;
		this.anInt3287 = arg2;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "()Z")
	@Override
	public boolean method5912() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "()V")
	@Override
	public void method5926() {
	}

	@OriginalMember(owner = "client!hj", name = "ba", descriptor = "(IIII)V")
	@Override
	public void ba(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt3304) {
			arg2 = this.anInt3304;
		}
		if (arg3 > this.anInt3302) {
			arg3 = this.anInt3302;
		}
		this.anInt3294 = arg0;
		this.anInt3288 = arg2;
		this.anInt3305 = arg1;
		this.anInt3315 = arg3;
		this.method2580();
	}

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "(I)Z")
	public boolean method2582(@OriginalArg(0) int arg0) {
		return super.anInterface7_10.method78(arg0).aBoolean276;
	}

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "()Z")
	@Override
	public boolean method5975() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "VA", descriptor = "(IIIIII)Z")
	@Override
	public boolean VA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass40_Sub1_3.anInt4751 * arg0 + this.aClass40_Sub1_3.anInt4754 * arg1 + this.aClass40_Sub1_3.anInt4745 * arg2 >> 15) + this.aClass40_Sub1_3.anInt4750;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass40_Sub1_3.anInt4751 * arg3 + this.aClass40_Sub1_3.anInt4754 * arg4 + this.aClass40_Sub1_3.anInt4745 * arg5 >> 15) + this.aClass40_Sub1_3.anInt4750;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt3300 && local52 < this.anInt3300 || !(local23 <= this.anInt3308 || local52 <= this.anInt3308)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt3289 * ((this.aClass40_Sub1_3.anInt4744 * arg0 + this.aClass40_Sub1_3.anInt4749 * arg1 + this.aClass40_Sub1_3.anInt4747 * arg2 >> 15) + this.aClass40_Sub1_3.anInt4753) / local23;
		@Pc(133) int local133 = this.anInt3289 * ((this.aClass40_Sub1_3.anInt4744 * arg3 + this.aClass40_Sub1_3.anInt4749 * arg4 + this.aClass40_Sub1_3.anInt4747 * arg5 >> 15) + this.aClass40_Sub1_3.anInt4753) / local52;
		if (local104 < this.anInt3286 && local133 < this.anInt3286 || local104 > this.anInt3303 && local133 > this.anInt3303) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt3311 * ((this.aClass40_Sub1_3.anInt4752 * arg0 + this.aClass40_Sub1_3.anInt4743 * arg1 + this.aClass40_Sub1_3.anInt4748 * arg2 >> 15) + this.aClass40_Sub1_3.anInt4746) / local23;
			@Pc(209) int local209 = this.anInt3311 * ((this.aClass40_Sub1_3.anInt4752 * arg3 + this.aClass40_Sub1_3.anInt4743 * arg4 + this.aClass40_Sub1_3.anInt4748 * arg5 >> 15) + this.aClass40_Sub1_3.anInt4746) / local52;
			return (local180 >= this.anInt3301 || local209 >= this.anInt3301) && (local180 <= this.anInt3298 || local209 <= this.anInt3298);
		}
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "()Z")
	@Override
	public boolean method5925() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([IIIII)Lclient!o;")
	@Override
	public Class137 method5969(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class137_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class137_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class137_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class137_Sub1_Sub1(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "()Lclient!c;")
	@Override
	public Class40 method5944() {
		return new Class40_Sub1();
	}

	@OriginalMember(owner = "client!hj", name = "x", descriptor = "()V")
	@Override
	public void method5964() {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!wh;Z)Lclient!o;")
	@Override
	public Class137 method5938(@OriginalArg(0) Class266 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray742;
		@Pc(5) byte[] local5 = arg0.aByteArray94;
		@Pc(8) int local8 = arg0.anInt7823;
		@Pc(11) int local11 = arg0.anInt7824;
		@Pc(76) Class137_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray95 == null) {
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
			local76 = new Class137_Sub1_Sub2(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray95;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class137_Sub1_Sub3(this, local20, local8, local11);
				local76 = new Class137_Sub1_Sub1(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class137_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.ha(arg0.anInt7825, arg0.anInt7826, arg0.anInt7821, arg0.anInt7822);
		return local76;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([Lclient!e;Lclient!d;Lclient!c;[Lclient!tq;I)V")
	@Override
	public void method5947(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class41_Sub8[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class17_Sub2[] local3 = new Class17_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class17_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class17_Sub2 local26 = Static79.method1476(this, local3);
		local26.method1485(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
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
				if (arg0 < this.anInt3294) {
					arg1 += local104 * (this.anInt3294 - arg0);
					arg0 = this.anInt3294;
				}
				if (arg2 >= this.anInt3288) {
					arg2 = this.anInt3288 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt3305 && local150 < this.anInt3315) {
							this.anIntArray341[arg0 + local150 * this.anInt3304] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt3305 && local213 < this.anInt3315) {
							local228 = arg0 + local213 * this.anInt3304;
							local233 = this.anIntArray341[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray341[local228] = local204 + local233;
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
				if (arg1 < this.anInt3305) {
					arg0 += local104 * (this.anInt3305 - arg1);
					arg1 = this.anInt3305;
				}
				if (arg3 >= this.anInt3315) {
					arg3 = this.anInt3315 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt3294 && local150 < this.anInt3288) {
							this.anIntArray341[local150 + arg1 * this.anInt3304] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt3294 && local213 < this.anInt3288) {
							local228 = local213 + arg1 * this.anInt3304;
							local233 = this.anIntArray341[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.anIntArray341[local213 + arg1 * this.anInt3304] = local204 + local516;
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

	@OriginalMember(owner = "client!hj", name = "ZA", descriptor = "(IIIII)V")
	@Override
	protected void ZA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt3305) {
			local8 = this.anInt3305;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt3315) {
			local21 = this.anInt3315;
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
				if (local91 < this.anInt3294) {
					local91 = this.anInt3294;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3288) {
					local102 = this.anInt3288;
				}
				local116 = local91 + local30 * this.anInt3304;
				for (local118 = local91; local118 < local102; local118++) {
					this.anIntArray341[local116++] = arg3;
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
				if (local91 < this.anInt3294) {
					local91 = this.anInt3294;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3288 - 1) {
					local102 = this.anInt3288 - 1;
				}
				local116 = local91 + local30 * this.anInt3304;
				for (local118 = local91; local118 <= local102; local118++) {
					this.anIntArray341[local116++] = arg3;
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
				if (local102 < this.anInt3294) {
					local102 = this.anInt3294;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt3288) {
					local116 = this.anInt3288;
				}
				local118 = local102 + local30 * this.anInt3304;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.anIntArray341[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray341[local118++] = local277 + local340;
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
				if (local102 < this.anInt3294) {
					local102 = this.anInt3294;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt3288 - 1) {
					local116 = this.anInt3288 - 1;
				}
				local118 = local102 + local30 * this.anInt3304;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.anIntArray341[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.anIntArray341[local118++] = local277 + local340;
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
				if (local91 < this.anInt3294) {
					local91 = this.anInt3294;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3288) {
					local102 = this.anInt3288;
				}
				local116 = local91 + local30 * this.anInt3304;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.anIntArray341[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray341[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt3294) {
					local91 = this.anInt3294;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt3288 - 1) {
					local102 = this.anInt3288 - 1;
				}
				local116 = local91 + local30 * this.anInt3304;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.anIntArray341[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.anIntArray341[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "()Z")
	@Override
	public boolean method5930() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "()V")
	@Override
	public void method5961() {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIZ)Lclient!o;")
	@Override
	public Class137 method5931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt3304 + arg0;
		@Pc(16) int local16 = this.anInt3304 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.anIntArray341[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class137_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class137_Sub1_Sub1(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "()V")
	@Override
	public void method5977() {
		if (this.aCanvas15 == null || this.aClass1_Sub9_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas15.getGraphics();
			this.aClass1_Sub9_1.method5361(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas15.repaint();
		}
	}

	@OriginalMember(owner = "client!hj", name = "AA", descriptor = "()I")
	@Override
	public int AA() {
		return this.anInt3300;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5959(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas15 == arg0) {
			this.method5920(null);
		}
		@Pc(15) Class1_Sub9 local15 = (Class1_Sub9) this.aClass38_14.method765((long) arg0.hashCode());
		if (local15 != null) {
			local15.method6178();
		}
	}

	@OriginalMember(owner = "client!hj", name = "Q", descriptor = "(III)V")
	@Override
	public void Q(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3297 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt3297 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt3297 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt3297 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt3297 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean198 = false;
		} else {
			this.aBoolean198 = true;
		}
	}

	@OriginalMember(owner = "client!hj", name = "va", descriptor = "()V")
	@Override
	public void va() {
		this.anInt3294 = 0;
		this.anInt3305 = 0;
		this.anInt3288 = this.anInt3304;
		this.anInt3315 = this.anInt3302;
		this.method2580();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!n;)V")
	@Override
	public void method5970(@OriginalArg(0) Class1_Sub11 arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "T", descriptor = "()F")
	@Override
	public float T() {
		return this.aFloat31;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(IIIIII)Lclient!ug;")
	@Override
	public Class86 method5929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	@Override
	public void method5911(@OriginalArg(0) int arg0) {
		if (this.anInt3306 == arg0) {
			return;
		}
		this.anInt3306 = arg0;
		this.aClass33Array1 = new Class33[this.anInt3306];
		for (@Pc(14) int local14 = 0; local14 < this.anInt3306; local14++) {
			this.aClass33Array1[local14] = new Class33(this);
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!e;Lclient!d;Lclient!c;Lclient!tq;I)V")
	@Override
	public void method5952(@OriginalArg(0) Class17 arg0, @OriginalArg(1) Class51 arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class41_Sub8 arg3) {
		((Class17_Sub2) arg0).method1485(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!hj", name = "ma", descriptor = "(IIIII)V")
	@Override
	public void ma(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt3305 || arg1 >= this.anInt3315) {
			return;
		}
		if (arg0 < this.anInt3294) {
			arg2 -= this.anInt3294 - arg0;
			arg0 = this.anInt3294;
		}
		if (arg0 + arg2 > this.anInt3288) {
			arg2 = this.anInt3288 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3304;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray341[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.anIntArray341[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray341[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.anIntArray341[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.anIntArray341[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V")
	@Override
	public void method5978(@OriginalArg(0) int arg0) {
		this.aClass33Array1[arg0].method725(Thread.currentThread());
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class33 local3 = this.method2586(Thread.currentThread());
		@Pc(6) Class218 local6 = local3.aClass218_1;
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
		@Pc(93) int local93 = arg0 - local6.method4983();
		@Pc(98) int local98 = arg1 - local6.method4980();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt6528 = 0;
		local6.aBoolean411 = local102 < 0 || local102 > local6.anInt6530 || local106 < 0 || local106 > local6.anInt6530 || local112 < 0 || local112 > local6.anInt6530;
		local6.method4982(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean411 = local102 < 0 || local102 > local6.anInt6530 || local106 < 0 || local106 > local6.anInt6530 || local118 < 0 || local118 > local6.anInt6530;
		local6.method4982(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!hj", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3290 = arg0;
		this.anInt3313 = arg1;
		this.anInt3289 = arg2;
		this.anInt3311 = arg3;
		this.method2580();
	}

	@OriginalMember(owner = "client!hj", name = "n", descriptor = "()V")
	@Override
	public void n() {
		this.anInt3297 = this.anInt3295;
		this.aBoolean197 = false;
	}

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "(IFFFFF)V")
	@Override
	public void B(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt3312 = (int) (arg1 * 65535.0F);
		this.anInt3292 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt3314 = (int) (arg3 * 65535.0F / local26);
		this.anInt3299 = (int) (arg4 * 65535.0F / local26);
		this.anInt3310 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "(I)Z")
	public boolean method2583(@OriginalArg(0) int arg0) {
		return super.anInterface7_10.method77(arg0);
	}

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "()Z")
	@Override
	public boolean method5953() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(II)V")
	@Override
	public void d(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3300 = arg0;
		this.anInt3308 = arg1;
		this.anInt3309 = this.anInt3308 - 255;
		this.method2587();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5920(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas15 = null;
			this.aClass1_Sub9_1 = null;
			if (this.aClass137_11 == null) {
				this.anIntArray341 = null;
				this.anInt3304 = this.anInt3302 = 1;
				this.method2579();
			}
			return;
		}
		@Pc(10) Class1_Sub9 local10 = (Class1_Sub9) this.aClass38_14.method765((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas15 = arg0;
		this.aClass1_Sub9_1 = local10;
		if (this.aClass137_11 != null) {
			return;
		}
		this.anIntArray341 = local10.anIntArray667;
		this.anInt3304 = local10.anInt7029;
		this.anInt3302 = local10.anInt7027;
		this.method2579();
		return;
	}

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "(I)V")
	@Override
	public void method5976(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt3285;
		for (@Pc(9) Object local9 = this.aClass91_47.method1989(); local9 != null; local9 = this.aClass91_47.method1995()) {
			@Pc(13) Class1_Sub45 local13 = (Class1_Sub45) local9;
			if (local13.aBoolean507) {
				local13.anInt7789 += local4;
				@Pc(27) int local27 = local13.anInt7789 / 20;
				if (local27 > 0) {
					@Pc(36) Class150 local36 = super.anInterface7_10.method78(local13.anInt7790);
					local13.method6013(local36.aByte55 * local4 * 50 / 1000, local36.aByte52 * local4 * 50 / 1000);
					local13.anInt7789 -= local27 * 20;
				}
				local13.aBoolean507 = false;
			}
		}
		this.anInt3285 = arg0;
		this.aClass91_46.method1998(5);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ue;III)V")
	public void method2584(@OriginalArg(0) Class41_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt5609;
		@Pc(4) int local4 = arg3;
		@Pc(8) int local8 = arg3 << 1;
		if (local2 == -1) {
			this.ZA(arg1, arg2, local4, arg0.anInt5608, 1);
			return;
		}
		if (this.anInt3316 != local2) {
			@Pc(32) Class137 local32 = (Class137) this.aClass91_46.method1988((long) local2);
			if (local32 == null) {
				@Pc(38) int[] local38 = this.method2585(local2);
				if (local38 == null) {
					return;
				}
				@Pc(48) int local48 = this.method2591(local2) ? 64 : 128;
				local32 = this.method5969(local38, local48, local48, local48);
				this.aClass91_46.method1990(local32, (long) local2);
			}
			this.anInt3316 = local2;
			this.aClass137_12 = local32;
		}
		this.aClass137_12.ya(arg1 - local4, arg2 - local4, local8, local8, 0, arg0.anInt5608, 1);
	}

	@OriginalMember(owner = "client!hj", name = "ya", descriptor = "(I)V")
	@Override
	public void ya(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "(I)[I")
	private int[] method2585(@OriginalArg(0) int arg0) {
		@Pc(2) Class91 local2 = this.aClass91_47;
		@Pc(12) Class1_Sub45 local12;
		synchronized (this.aClass91_47) {
			local12 = (Class1_Sub45) this.aClass91_47.method1988((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_10.method77(arg0)) {
					return null;
				}
				@Pc(32) Class150 local32 = super.anInterface7_10.method78(arg0);
				@Pc(42) int local42 = local32.aBoolean272 || this.aBoolean199 ? 64 : 128;
				local12 = new Class1_Sub45(arg0, local42, super.anInterface7_10.method79(local42, arg0, local42, 0.7F), local32.aBoolean273);
				this.aClass91_47.method1990(local12, (long) arg0);
			}
		}
		local12.aBoolean507 = true;
		return local12.method6014();
	}

	@OriginalMember(owner = "client!hj", name = "HA", descriptor = "(IIII)V")
	@Override
	public void HA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3294 < arg0) {
			this.anInt3294 = arg0;
		}
		if (this.anInt3305 < arg1) {
			this.anInt3305 = arg1;
		}
		if (this.anInt3288 > arg2) {
			this.anInt3288 = arg2;
		}
		if (this.anInt3315 > arg3) {
			this.anInt3315 = arg3;
		}
		this.method2580();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!bo;")
	public Class33 method2586(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3306; local1++) {
			if (this.aClass33Array1[local1].aRunnable1 == arg0) {
				return this.aClass33Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[Lclient!ja;)V")
	@Override
	public void method5956(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub4[] arg1) {
	}

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "(IIII)V")
	@Override
	public void s(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3295 = this.anInt3297;
		this.anInt3291 = arg0;
		this.anInt3297 = arg1;
		this.anInt3287 = arg2;
		this.aBoolean197 = true;
	}

	@OriginalMember(owner = "client!hj", name = "K", descriptor = "(IIIIII[BII)V")
	@Override
	public void K(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt3304;
		@Pc(35) int local35 = this.anInt3304 - arg2;
		if (arg1 + arg3 > this.anInt3315) {
			arg3 -= arg1 + arg3 - this.anInt3315;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt3305) {
			local59 = this.anInt3305 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt3304;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt3288) {
			local59 = arg0 + arg2 - this.anInt3288;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt3294) {
			local59 = this.anInt3294 - arg0;
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
						this.anIntArray341[local30++] = arg4;
					} else {
						this.anIntArray341[local30++] = arg5;
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
					local245 = this.anIntArray341[local30];
					this.anIntArray341[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.anIntArray341[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.anIntArray341[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(FFF)V")
	@Override
	public void method5917(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)Lclient!n;")
	@Override
	public Class1_Sub11 method5940(@OriginalArg(0) int arg0) {
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ko;IIII)Lclient!e;")
	@Override
	public Class17 method5922(@OriginalArg(0) Class147 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class17_Sub2(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!hj", name = "IA", descriptor = "(IIIII)V")
	@Override
	public void IA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt3294 || arg0 >= this.anInt3288) {
			return;
		}
		if (arg1 < this.anInt3305) {
			arg2 -= this.anInt3305 - arg1;
			arg1 = this.anInt3305;
		}
		if (arg1 + arg2 > this.anInt3315) {
			arg2 = this.anInt3315 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt3304;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.anIntArray341[local40 + local54 * this.anInt3304] = arg3;
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
				local111 = local40 + local103 * this.anInt3304;
				local116 = this.anIntArray341[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.anIntArray341[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt3304;
				local111 = this.anIntArray341[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.anIntArray341[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!hj", name = "da", descriptor = "(FF)V")
	@Override
	public void da(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat31 = arg0;
		this.aFloat30 = arg1;
		this.method2587();
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)I")
	@Override
	public int method5954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!hj", name = "OA", descriptor = "()I")
	@Override
	public int OA() {
		@Pc(2) int local2 = this.anInt3293;
		this.anInt3293 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([Lclient!e;Lclient!c;[Lclient!tq;I)V")
	@Override
	public void method5943(@OriginalArg(0) Class17[] arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class41_Sub8[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class17_Sub2[] local3 = new Class17_Sub2[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class17_Sub2) arg0[local5];
			}
		}
		@Pc(26) Class17_Sub2 local26 = Static79.method1476(this, local3);
		local26.method1485(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!hj", name = "y", descriptor = "()Z")
	@Override
	public boolean method5973() {
		return true;
	}

	@OriginalMember(owner = "client!hj", name = "E", descriptor = "()V")
	private void method2587() {
		if (this.aFloat30 == 0.0F) {
			this.anInt3307 = this.anInt3308;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt3308;
		@Pc(12) float local12 = (float) this.anInt3300;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat31 / (this.aFloat30 + this.aFloat31);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat30;
		this.anInt3307 = (int) (((float) this.anInt3308 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!hj", name = "i", descriptor = "()I")
	@Override
	public int method5928() {
		return 0;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "()V")
	@Override
	protected void method5906() {
		if (this.aBoolean196) {
			Static198.method6180(false, true);
			this.aBoolean196 = false;
		}
		this.aClass1_Sub9_1 = null;
		this.aCanvas15 = null;
		this.aClass38_14 = null;
		this.aBoolean195 = true;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!d;)V")
	@Override
	public void method5908(@OriginalArg(0) Class51 arg0) {
		@Pc(3) Class41_Sub3 local3 = arg0.aClass60_1.aClass41_Sub3_1;
		for (@Pc(6) Class41_Sub3 local6 = local3.aClass41_Sub3_9; local6 != local3; local6 = local6.aClass41_Sub3_9) {
			@Pc(10) Class41_Sub3_Sub2 local10 = (Class41_Sub3_Sub2) local6;
			@Pc(15) int local15 = local10.anInt5607 >> 12;
			@Pc(20) int local20 = local10.anInt5610 >> 12;
			@Pc(25) int local25 = local10.anInt5606 >> 12;
			@Pc(49) int local49 = this.aClass40_Sub1_3.anInt4750 + (this.aClass40_Sub1_3.anInt4751 * local15 + this.aClass40_Sub1_3.anInt4754 * local20 + this.aClass40_Sub1_3.anInt4745 * local25 >> 15);
			if (local49 >= this.anInt3300 && local49 <= this.anInt3309) {
				@Pc(90) int local90 = this.anInt3290 + this.anInt3289 * (this.aClass40_Sub1_3.anInt4753 + (this.aClass40_Sub1_3.anInt4744 * local15 + this.aClass40_Sub1_3.anInt4749 * local20 + this.aClass40_Sub1_3.anInt4747 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt3313 + this.anInt3311 * (this.aClass40_Sub1_3.anInt4746 + (this.aClass40_Sub1_3.anInt4752 * local15 + this.aClass40_Sub1_3.anInt4743 * local20 + this.aClass40_Sub1_3.anInt4748 * local25 >> 15)) / local49;
				if (local90 >= this.anInt3294 && local90 <= this.anInt3288 && local122 >= this.anInt3305 && local122 <= this.anInt3315) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method2584(local10, local90, local122, (local10.anInt5605 * this.anInt3289 >> 12) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5955(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II[I[I)Lclient!ta;")
	@Override
	public Class24 method5939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class24_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "()V")
	@Override
	public void method5935() {
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)V")
	@Override
	public void method5915(@OriginalArg(0) int arg0) {
		this.aClass33Array1[arg0].method725(null);
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5965(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub9 local8 = (Class1_Sub9) this.aClass38_14.method765((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static138.method1915(arg0);
			this.aClass38_14.method766(local8, (long) arg0.hashCode());
		}
	}

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "(I)V")
	@Override
	public void t(@OriginalArg(0) int arg0) {
		this.P(0, 0, this.anInt3304, this.anInt3302, arg0, 0);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!qm;[Lclient!wh;Z)Lclient!la;")
	@Override
	public Class20 method5968(@OriginalArg(0) Class209 arg0, @OriginalArg(1) Class266[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt7823;
			local7[local11] = arg1[local11].anInt7824;
			if (arg1[local11].aByteArray95 != null) {
			}
		}
		return new Class20_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "(I)I")
	public int method2588(@OriginalArg(0) int arg0) {
		return super.anInterface7_10.method78(arg0).aShort59 & 0xFFFF;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lclient!ug;)V")
	@Override
	public void method5967(@OriginalArg(0) Class86 arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIF)Lclient!ja;")
	@Override
	public Class1_Sub4 method5924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "()Z")
	@Override
	public boolean method5907() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
	@Override
	public void method5957(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!hj", name = "aa", descriptor = "()F")
	@Override
	public float aa() {
		return this.aFloat30;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIILclient!ta;II)V")
	@Override
	public void method5933(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class24 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class24_Sub1 local2 = (Class24_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray44;
		@Pc(8) int[] local8 = local2.anIntArray46;
		@Pc(17) int local17 = this.anInt3305 > arg7 ? this.anInt3305 : arg7;
		@Pc(32) int local32 = this.anInt3315 < arg7 + local5.length ? this.anInt3315 : arg7 + local5.length;
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
					if (local129 >= this.anInt3294 && local129 < this.anInt3288 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.anIntArray341[local129 + arg1 * this.anInt3304] = arg4;
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
					if (local133 >= this.anInt3294 && local133 < this.anInt3288 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt3304;
						local248 = this.anIntArray341[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.anIntArray341[local133 + arg1 * this.anInt3304] = local201 + local584;
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
		if (arg0 < this.anInt3294) {
			arg1 += local83 * (this.anInt3294 - arg0);
			arg0 = this.anInt3294;
		}
		if (arg2 >= this.anInt3288) {
			arg2 = this.anInt3288 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.anIntArray341[arg0 + local129 * this.anInt3304] = arg4;
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
					local243 = arg0 + local133 * this.anInt3304;
					local248 = this.anIntArray341[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.anIntArray341[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "(Z)V")
	@Override
	public void method5982(@OriginalArg(0) boolean arg0) {
		this.aBoolean199 = arg0;
		this.aClass91_47.method1999();
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method5946(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas15 == null || this.aClass1_Sub9_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas15.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt3304 && local21.y <= this.anInt3302 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass1_Sub9_1.method5360(local21.height, local21.width, local14, local21.y, local21.x);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas15.repaint();
		}
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
	@Override
	public int method5913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!hj", name = "o", descriptor = "()Z")
	@Override
	public boolean method5945() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIIII)V")
	public void method2589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface7_10.method78(arg5).aBoolean274) {
			this.ZA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt3316 != arg5) {
			@Pc(26) Class137 local26 = (Class137) this.aClass91_46.method1988((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method2585(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method2591(arg5) ? 64 : 128;
				local26 = this.method5969(local32, local43, local43, local43);
				this.aClass91_46.method1990(local26, (long) arg5);
			}
			this.anInt3316 = arg5;
			this.aClass137_12 = local26;
		}
		this.aClass137_12.ya(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!hj", name = "Y", descriptor = "()I")
	@Override
	public int Y() {
		@Pc(2) int local2 = this.anInt3296;
		this.anInt3296 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!hj", name = "w", descriptor = "()Z")
	@Override
	public boolean method5963() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "l", descriptor = "(I)[I")
	public int[] method2590(@OriginalArg(0) int arg0) {
		@Pc(2) Class91 local2 = this.aClass91_47;
		@Pc(12) Class1_Sub45 local12;
		synchronized (this.aClass91_47) {
			local12 = (Class1_Sub45) this.aClass91_47.method1988((long) arg0);
			if (local12 == null) {
				if (!super.anInterface7_10.method77(arg0)) {
					return null;
				}
				@Pc(32) Class150 local32 = super.anInterface7_10.method78(arg0);
				@Pc(42) int local42 = local32.aBoolean272 || this.aBoolean199 ? 64 : 128;
				local12 = new Class1_Sub45(arg0, local42, super.anInterface7_10.method76(arg0, 0.7F, local42, local42, true), local32.aBoolean273);
				this.aClass91_47.method1990(local12, (long) arg0);
			}
		}
		local12.aBoolean507 = true;
		return local12.method6014();
	}

	@OriginalMember(owner = "client!hj", name = "MA", descriptor = "([I)V")
	@Override
	public void MA(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt3294;
		arg0[1] = this.anInt3305;
		arg0[2] = this.anInt3288;
		arg0[3] = this.anInt3315;
	}

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "(I)Z")
	public boolean method2591(@OriginalArg(0) int arg0) {
		return this.aBoolean199 || super.anInterface7_10.method78(arg0).aBoolean272;
	}

	@OriginalMember(owner = "client!hj", name = "JA", descriptor = "(F)V")
	@Override
	public void JA(@OriginalArg(0) float arg0) {
		this.lb = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!hj", name = "SA", descriptor = "(Lclient!c;)V")
	@Override
	public void SA(@OriginalArg(0) Class40 arg0) {
		this.aClass40_Sub1_3 = (Class40_Sub1) arg0;
	}

	@OriginalMember(owner = "client!hj", name = "c", descriptor = "()Z")
	@Override
	public boolean method5910() {
		return false;
	}

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "()V")
	@Override
	public void method5950() {
		this.aClass91_47.method1999();
	}

	@OriginalMember(owner = "client!hj", name = "P", descriptor = "(IIIIII)V")
	@Override
	public void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt3294) {
			arg2 -= this.anInt3294 - arg0;
			arg0 = this.anInt3294;
		}
		if (arg1 < this.anInt3305) {
			arg3 -= this.anInt3305 - arg1;
			arg1 = this.anInt3305;
		}
		if (arg0 + arg2 > this.anInt3288) {
			arg2 = this.anInt3288 - arg0;
		}
		if (arg1 + arg3 > this.anInt3315) {
			arg3 = this.anInt3315 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt3288 || arg1 > this.anInt3315) {
			return;
		}
		@Pc(67) int local67 = this.anInt3304 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt3304;
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
						local221 = this.anIntArray341[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.anIntArray341[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.anIntArray341[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.anIntArray341[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.anIntArray341[arg2] = arg4;
					arg2++;
					this.anIntArray341[arg2] = arg4;
					arg2++;
					this.anIntArray341[arg2] = arg4;
					arg2++;
					this.anIntArray341[arg2] = arg4;
					arg2++;
					this.anIntArray341[arg2] = arg4;
					arg2++;
					this.anIntArray341[arg2] = arg4;
					arg2++;
					this.anIntArray341[arg2] = arg4;
					arg2++;
					this.anIntArray341[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.anIntArray341[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "(IIIIII)V")
	@Override
	public void method5958(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.ma(arg0, arg1, arg2, arg4, arg5);
		this.ma(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.IA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.IA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method5934(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class1_Sub9 local8 = (Class1_Sub9) this.aClass38_14.method765((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method6178();
		local8 = Static138.method1915(arg0);
		this.aClass38_14.method766(local8, (long) arg0.hashCode());
		if (this.aCanvas15 != arg0 || this.aClass137_11 != null) {
			return;
		}
		this.aClass1_Sub9_1 = local8;
		this.anIntArray341 = local8.anIntArray667;
		this.anInt3304 = local8.anInt7029;
		this.anInt3302 = local8.anInt7027;
		this.method2579();
	}
}
