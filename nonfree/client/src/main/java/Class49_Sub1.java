import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cv")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "Ljava/awt/Canvas;")
	private Canvas aCanvas3;

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "Z")
	private boolean aBoolean71;

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "Lclient!dj;")
	private Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "Z")
	private boolean aBoolean72;

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "I")
	private int anInt1257;

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "Lclient!mn;")
	private Class163 aClass163_5;

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "I")
	public int anInt1258;

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "I")
	public int anInt1259;

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "I")
	private int anInt1260;

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "I")
	private int anInt1261;

	@OriginalMember(owner = "client!cv", name = "A", descriptor = "I")
	public int anInt1262;

	@OriginalMember(owner = "client!cv", name = "B", descriptor = "I")
	private int anInt1263;

	@OriginalMember(owner = "client!cv", name = "C", descriptor = "I")
	public int anInt1264;

	@OriginalMember(owner = "client!cv", name = "D", descriptor = "I")
	public int anInt1265;

	@OriginalMember(owner = "client!cv", name = "E", descriptor = "[Lclient!dc;")
	private Class52[] aClass52Array1;

	@OriginalMember(owner = "client!cv", name = "F", descriptor = "I")
	public int anInt1266;

	@OriginalMember(owner = "client!cv", name = "G", descriptor = "I")
	public int anInt1267;

	@OriginalMember(owner = "client!cv", name = "H", descriptor = "I")
	public int anInt1268;

	@OriginalMember(owner = "client!cv", name = "I", descriptor = "I")
	public int anInt1269;

	@OriginalMember(owner = "client!cv", name = "J", descriptor = "I")
	public int anInt1270;

	@OriginalMember(owner = "client!cv", name = "K", descriptor = "I")
	public int anInt1271;

	@OriginalMember(owner = "client!cv", name = "L", descriptor = "I")
	public int anInt1272;

	@OriginalMember(owner = "client!cv", name = "M", descriptor = "Lclient!l;")
	private Class17 aClass17_10;

	@OriginalMember(owner = "client!cv", name = "N", descriptor = "I")
	public int anInt1273;

	@OriginalMember(owner = "client!cv", name = "O", descriptor = "I")
	private int anInt1274;

	@OriginalMember(owner = "client!cv", name = "P", descriptor = "I")
	public int anInt1275;

	@OriginalMember(owner = "client!cv", name = "Q", descriptor = "F")
	private float aFloat19;

	@OriginalMember(owner = "client!cv", name = "R", descriptor = "I")
	public int anInt1276;

	@OriginalMember(owner = "client!cv", name = "S", descriptor = "I")
	public int anInt1277;

	@OriginalMember(owner = "client!cv", name = "T", descriptor = "F")
	private float aFloat20;

	@OriginalMember(owner = "client!cv", name = "U", descriptor = "I")
	public int anInt1278;

	@OriginalMember(owner = "client!cv", name = "V", descriptor = "Lclient!nj;")
	private final Class171 aClass171_6;

	@OriginalMember(owner = "client!cv", name = "W", descriptor = "I")
	public int anInt1279;

	@OriginalMember(owner = "client!cv", name = "X", descriptor = "I")
	public int anInt1280;

	@OriginalMember(owner = "client!cv", name = "Y", descriptor = "I")
	public int anInt1281;

	@OriginalMember(owner = "client!cv", name = "Z", descriptor = "Lclient!pu;")
	public Class35_Sub1 aClass35_Sub1_1;

	@OriginalMember(owner = "client!cv", name = "ab", descriptor = "Lclient!nj;")
	private final Class171 aClass171_7;

	@OriginalMember(owner = "client!cv", name = "bb", descriptor = "I")
	public int anInt1282;

	@OriginalMember(owner = "client!cv", name = "cb", descriptor = "I")
	public int anInt1283;

	@OriginalMember(owner = "client!cv", name = "db", descriptor = "I")
	public int anInt1284;

	@OriginalMember(owner = "client!cv", name = "eb", descriptor = "I")
	public int anInt1285;

	@OriginalMember(owner = "client!cv", name = "fb", descriptor = "Z")
	public boolean aBoolean73;

	@OriginalMember(owner = "client!cv", name = "gb", descriptor = "I")
	public int anInt1286;

	@OriginalMember(owner = "client!cv", name = "hb", descriptor = "I")
	public int anInt1287;

	@OriginalMember(owner = "client!cv", name = "ib", descriptor = "Z")
	public boolean aBoolean74;

	@OriginalMember(owner = "client!cv", name = "jb", descriptor = "I")
	private int anInt1288;

	@OriginalMember(owner = "client!cv", name = "kb", descriptor = "Z")
	private boolean aBoolean75;

	@OriginalMember(owner = "client!cv", name = "lb", descriptor = "[I")
	public int[] lb;

	@OriginalMember(owner = "client!cv", name = "mb", descriptor = "Lclient!l;")
	private Class17 aClass17_11;

	@OriginalMember(owner = "client!cv", name = "nb", descriptor = "I")
	private int anInt1289;

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(ILjava/awt/Canvas;Lclient!ga;)V")
	public Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Interface4 arg2) {
		this(arg0, arg2);
		this.method4438(arg1);
		this.method4436(arg1);
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(ILclient!ga;)V")
	private Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Interface4 arg1) {
		super(arg0, arg1);
		this.aBoolean72 = false;
		this.aBoolean71 = false;
		this.aClass163_5 = new Class163(4);
		this.anInt1260 = 0;
		this.anInt1271 = 78642;
		this.anInt1267 = 75518;
		this.anInt1268 = 45823;
		this.anInt1266 = 0;
		this.anInt1270 = 0;
		this.anInt1280 = 512;
		this.anInt1277 = 0;
		this.anInt1282 = 50;
		this.anInt1258 = 3500;
		this.anInt1283 = 512;
		this.anInt1281 = 0;
		this.anInt1279 = 0;
		this.anInt1263 = 0;
		this.aBoolean74 = false;
		this.anInt1285 = 0;
		this.anInt1261 = 0;
		this.aBoolean75 = false;
		this.anInt1288 = 3500;
		this.anInt1286 = 0;
		this.anInt1265 = this.anInt1288 - 255;
		this.aClass171_7 = new Class171(16);
		this.anInt1289 = -1;
		this.aClass171_6 = new Class171(20);
		this.aClass35_Sub1_1 = new Class35_Sub1();
		this.method4424(1);
		this.method4407(0);
		Static336.method4686(false, true);
		this.aBoolean71 = true;
	}

	@OriginalMember(owner = "client!cv", name = "T", descriptor = "(IFFFFF)V")
	@Override
	public void T(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5) {
		this.anInt1268 = (int) (arg1 * 65535.0F);
		this.anInt1271 = (int) (arg2 * 65535.0F);
		@Pc(26) float local26 = (float) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4 + arg5 * arg5));
		this.anInt1262 = (int) (arg3 * 65535.0F / local26);
		this.anInt1275 = (int) (arg4 * 65535.0F / local26);
		this.anInt1272 = (int) (arg5 * 65535.0F / local26);
	}

	@OriginalMember(owner = "client!cv", name = "TA", descriptor = "(IIIII)V")
	@Override
	public void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0 < this.anInt1266 || arg0 >= this.anInt1286) {
			return;
		}
		if (arg1 < this.anInt1281) {
			arg2 -= this.anInt1281 - arg1;
			arg1 = this.anInt1281;
		}
		if (arg1 + arg2 > this.anInt1279) {
			arg2 = this.anInt1279 - arg1;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1264;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.lb[local40 + local54 * this.anInt1264] = arg3;
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
				local111 = local40 + local103 * this.anInt1264;
				local116 = this.lb[local111];
				local116 = ((local116 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local116 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.lb[local111] = local97 + local116;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local103 = local40 + local54 * this.anInt1264;
				local111 = this.lb[local103];
				local116 = arg3 + local111;
				@Pc(178) int local178 = (arg3 & 0xFF00FF) + (local111 & 0xFF00FF);
				@Pc(188) int local188 = (local178 & 0x1000100) + (local116 - local178 & 0x10000);
				this.lb[local103] = local116 - local188 | local188 - (local188 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cv", name = "v", descriptor = "()Z")
	@Override
	public boolean method4465() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "(I)[I")
	private int[] method1087(@OriginalArg(0) int arg0) {
		@Pc(2) Class171 local2 = this.aClass171_6;
		@Pc(12) Class2_Sub45 local12;
		synchronized (this.aClass171_6) {
			local12 = (Class2_Sub45) this.aClass171_6.method3941((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_6.method3792(arg0)) {
					return null;
				}
				@Pc(32) Class140 local32 = super.anInterface4_6.method3794(arg0);
				@Pc(42) int local42 = local32.aBoolean286 || this.aBoolean75 ? 64 : 128;
				local12 = new Class2_Sub45(arg0, local42, super.anInterface4_6.method3791(local42, arg0, 0.7F, local42), local32.aBoolean292);
				this.aClass171_6.method3940((long) arg0, local12);
			}
		}
		local12.aBoolean479 = true;
		return local12.method5729();
	}

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "(I)V")
	@Override
	public void method4454(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "(I)V")
	@Override
	public void p(@OriginalArg(0) int arg0) {
		this.O(0, 0, this.anInt1264, this.anInt1274, arg0, 0);
	}

	@OriginalMember(owner = "client!cv", name = "h", descriptor = "()Z")
	@Override
	public boolean method4431() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "H", descriptor = "(IIII)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1278 = arg0;
		this.anInt1269 = arg1;
		this.anInt1280 = arg2;
		this.anInt1283 = arg3;
		this.method1090();
	}

	@OriginalMember(owner = "client!cv", name = "da", descriptor = "([I)V")
	@Override
	public void da(@OriginalArg(0) int[] arg0) {
		arg0[0] = this.anInt1266;
		arg0[1] = this.anInt1281;
		arg0[2] = this.anInt1286;
		arg0[3] = this.anInt1279;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIZ)Lclient!l;")
	@Override
	public Class17 method4441(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(11) int local11 = arg1 * this.anInt1264 + arg0;
		@Pc(16) int local16 = this.anInt1264 - arg2;
		for (@Pc(18) int local18 = 0; local18 < arg3; local18++) {
			@Pc(23) int local23 = local18 * arg2;
			for (@Pc(25) int local25 = 0; local25 < arg2; local25++) {
				local4[local23 + local25] = this.lb[local11++];
			}
			local11 += local16;
		}
		if (arg4) {
			return new Class17_Sub1_Sub3(this, local4, arg2, arg3);
		} else {
			return new Class17_Sub1_Sub2(this, local4, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!cv", name = "fa", descriptor = "(IIII)V")
	@Override
	public void fa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1266 < arg0) {
			this.anInt1266 = arg0;
		}
		if (this.anInt1281 < arg1) {
			this.anInt1281 = arg1;
		}
		if (this.anInt1286 > arg2) {
			this.anInt1286 = arg2;
		}
		if (this.anInt1279 > arg3) {
			this.anInt1279 = arg3;
		}
		this.method1090();
	}

	@OriginalMember(owner = "client!cv", name = "w", descriptor = "()I")
	@Override
	public int w() {
		@Pc(2) int local2 = this.anInt1263;
		this.anInt1263 = 0;
		return local2;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/lang/Runnable;)Lclient!dc;")
	public Class52 method1088(@OriginalArg(0) Runnable arg0) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1284; local1++) {
			if (this.aClass52Array1[local1].aRunnable1 == arg0) {
				return this.aClass52Array1[local1];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(Z)V")
	@Override
	public void method4476(@OriginalArg(0) boolean arg0) {
		this.aBoolean75 = arg0;
		this.aClass171_6.method3936();
	}

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "()V")
	@Override
	public void l() {
		this.anInt1285 = this.anInt1261;
		this.aBoolean74 = false;
	}

	@OriginalMember(owner = "client!cv", name = "ia", descriptor = "(II)V")
	@Override
	public void ia(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1282 = arg0;
		this.anInt1288 = arg1;
		this.anInt1265 = this.anInt1288 - 255;
		this.method1097();
	}

	@OriginalMember(owner = "client!cv", name = "t", descriptor = "()Z")
	@Override
	public boolean method4458() {
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "z", descriptor = "()Z")
	@Override
	public boolean method4469() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "OA", descriptor = "(IIII)V")
	@Override
	public void OA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 < 0) {
			arg0 = 0;
		}
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > this.anInt1264) {
			arg2 = this.anInt1264;
		}
		if (arg3 > this.anInt1274) {
			arg3 = this.anInt1274;
		}
		this.anInt1266 = arg0;
		this.anInt1286 = arg2;
		this.anInt1281 = arg1;
		this.anInt1279 = arg3;
		this.method1090();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II[I[I)Lclient!ma;")
	@Override
	public Class73 method4430(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		return new Class73_Sub1(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(Z)V")
	@Override
	public void method4423(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "()Z")
	@Override
	public boolean method4408() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!u;)V")
	@Override
	public void method4453(@OriginalArg(0) Class2_Sub17 arg0) {
	}

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "()Z")
	@Override
	public boolean method4457() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIF)Lclient!jd;")
	@Override
	public Class2_Sub20 method4478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cv", name = "YA", descriptor = "()I")
	@Override
	public int YA() {
		return this.anInt1288;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!kq;IIII)Lclient!t;")
	@Override
	public Class91 method4414(@OriginalArg(0) Class146 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class91_Sub1(this, arg0, arg1, arg3, arg4, arg2);
	}

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "()Lclient!c;")
	@Override
	public Class35 method4445() {
		@Pc(3) Class52 local3 = this.method1088(Thread.currentThread());
		return local3.aClass35_Sub1_2;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V")
	@Override
	public void method4424(@OriginalArg(0) int arg0) {
		if (this.anInt1284 == arg0) {
			return;
		}
		this.anInt1284 = arg0;
		this.aClass52Array1 = new Class52[this.anInt1284];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1284; local14++) {
			this.aClass52Array1[local14] = new Class52(this);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(FFF)V")
	@Override
	public void method4427(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
	}

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "(FF)V")
	@Override
	public void g(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat20 = arg0;
		this.aFloat19 = arg1;
		this.method1097();
	}

	@OriginalMember(owner = "client!cv", name = "UA", descriptor = "(III)V")
	@Override
	public void UA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1285 = arg0 & 0xFFFFFF;
		@Pc(11) int local11 = this.anInt1285 >>> 16 & 0xFF;
		if (local11 < 2) {
			local11 = 2;
		}
		@Pc(23) int local23 = this.anInt1285 >> 8 & 0xFF;
		if (local23 < 2) {
			local23 = 2;
		}
		@Pc(33) int local33 = this.anInt1285 & 0xFF;
		if (local33 < 2) {
			local33 = 2;
		}
		this.anInt1285 = local11 << 16 | local23 << 8 | local33;
		if (arg1 < 0) {
			this.aBoolean73 = false;
		} else {
			this.aBoolean73 = true;
		}
	}

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "()Z")
	@Override
	public boolean method4447() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "y", descriptor = "()Lclient!c;")
	@Override
	public Class35 method4467() {
		return new Class35_Sub1();
	}

	@OriginalMember(owner = "client!cv", name = "JA", descriptor = "(IIIIII)Z")
	@Override
	public boolean JA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(23) int local23 = (this.aClass35_Sub1_1.anInt5529 * arg0 + this.aClass35_Sub1_1.anInt5526 * arg1 + this.aClass35_Sub1_1.anInt5520 * arg2 >> 15) + this.aClass35_Sub1_1.anInt5521;
		if (local23 < 1) {
			local23 = 1;
		}
		@Pc(52) int local52 = (this.aClass35_Sub1_1.anInt5529 * arg3 + this.aClass35_Sub1_1.anInt5526 * arg4 + this.aClass35_Sub1_1.anInt5520 * arg5 >> 15) + this.aClass35_Sub1_1.anInt5521;
		if (local52 < 1) {
			local52 = 1;
		}
		if (local23 < this.anInt1282 && local52 < this.anInt1282 || !(local23 <= this.anInt1288 || local52 <= this.anInt1288)) {
			return false;
		}
		@Pc(104) int local104 = this.anInt1280 * ((this.aClass35_Sub1_1.anInt5519 * arg0 + this.aClass35_Sub1_1.anInt5522 * arg1 + this.aClass35_Sub1_1.anInt5527 * arg2 >> 15) + this.aClass35_Sub1_1.anInt5523) / local23;
		@Pc(133) int local133 = this.anInt1280 * ((this.aClass35_Sub1_1.anInt5519 * arg3 + this.aClass35_Sub1_1.anInt5522 * arg4 + this.aClass35_Sub1_1.anInt5527 * arg5 >> 15) + this.aClass35_Sub1_1.anInt5523) / local52;
		if (local104 < this.anInt1259 && local133 < this.anInt1259 || local104 > this.anInt1287 && local133 > this.anInt1287) {
			return false;
		} else {
			@Pc(180) int local180 = this.anInt1283 * ((this.aClass35_Sub1_1.anInt5524 * arg0 + this.aClass35_Sub1_1.anInt5518 * arg1 + this.aClass35_Sub1_1.anInt5528 * arg2 >> 15) + this.aClass35_Sub1_1.anInt5525) / local23;
			@Pc(209) int local209 = this.anInt1283 * ((this.aClass35_Sub1_1.anInt5524 * arg3 + this.aClass35_Sub1_1.anInt5518 * arg4 + this.aClass35_Sub1_1.anInt5528 * arg5 >> 15) + this.aClass35_Sub1_1.anInt5525) / local52;
			return (local180 >= this.anInt1273 || local209 >= this.anInt1273) && (local180 <= this.anInt1276 || local209 <= this.anInt1276);
		}
	}

	@OriginalMember(owner = "client!cv", name = "r", descriptor = "()Z")
	@Override
	public boolean method4455() {
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!b;III)V")
	public void method1089(@OriginalArg(0) Class8_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) int local2 = arg0.anInt7357;
		@Pc(6) int local6 = arg3 >> 1;
		if (local2 == -1) {
			this.NA(arg1, arg2, local6, arg0.anInt7358, 1);
			return;
		}
		if (this.anInt1289 != local2) {
			@Pc(30) Class17 local30 = (Class17) this.aClass171_7.method3941((long) local2);
			if (local30 == null) {
				@Pc(36) int[] local36 = this.method1087(local2);
				if (local36 == null) {
					return;
				}
				@Pc(46) int local46 = this.method1094(local2) ? 64 : 128;
				local30 = this.method4422(local36, local46, local46, local46);
				this.aClass171_7.method3940((long) local2, local30);
			}
			this.anInt1289 = local2;
			this.aClass17_11 = local30;
		}
		if (this.aClass17_11.j() == 64) {
			arg3 <<= 0x1;
			local6 <<= 0x1;
		}
		this.aClass17_11.s(arg1 - local6, arg2 - local6, arg3, arg3, 0, arg0.anInt7358, 1);
	}

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "(I)V")
	@Override
	public void method4481(@OriginalArg(0) int arg0) {
		this.aClass52Array1[arg0].method1148(null);
	}

	@OriginalMember(owner = "client!cv", name = "u", descriptor = "()Z")
	@Override
	public boolean method4459() {
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "D", descriptor = "()V")
	private void method1090() {
		this.anInt1259 = this.anInt1266 - this.anInt1278;
		this.anInt1287 = this.anInt1286 - this.anInt1278;
		this.anInt1273 = this.anInt1281 - this.anInt1269;
		this.anInt1276 = this.anInt1279 - this.anInt1269;
		for (@Pc(29) int local29 = 0; local29 < this.anInt1284; local29++) {
			@Pc(36) Class21 local36 = this.aClass52Array1[local29].aClass21_1;
			local36.anInt553 = this.anInt1278 - this.anInt1266;
			local36.anInt552 = this.anInt1269 - this.anInt1281;
			local36.anInt551 = this.anInt1286 - this.anInt1266;
			local36.anInt555 = this.anInt1279 - this.anInt1281;
		}
		@Pc(78) int local78 = this.anInt1281 * this.anInt1264 + this.anInt1266;
		for (@Pc(81) int local81 = this.anInt1281; local81 < this.anInt1279; local81++) {
			for (@Pc(84) int local84 = 0; local84 < this.anInt1284; local84++) {
				this.aClass52Array1[local84].aClass21_1.anIntArray49[local81 - this.anInt1281] = local78;
			}
			local78 += this.anInt1264;
		}
	}

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "(I)Z")
	public boolean method1091(@OriginalArg(0) int arg0) {
		return super.anInterface4_6.method3792(arg0);
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4438(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub1 local8 = (Class2_Sub1) this.aClass163_5.method3769((long) arg0.hashCode());
		if (local8 == null) {
			local8 = Static359.method4895(arg0);
			this.aClass163_5.method3764((long) arg0.hashCode(), local8);
		}
	}

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "(I)I")
	public int method1092(@OriginalArg(0) int arg0) {
		return super.anInterface4_6.method3794(arg0).aShort44 & 0xFFFF;
	}

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "()Z")
	@Override
	public boolean method4444() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([Lclient!t;Lclient!pn;Lclient!c;[Lclient!ii;I)V")
	@Override
	public void method4421(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class8_Sub4[] arg3, @OriginalArg(4) int arg4) {
		@Pc(3) Class91_Sub1[] local3 = new Class91_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class91_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class91_Sub1 local26 = Static122.method2159(this, local3);
		local26.method2153(arg2, arg3 == null ? null : arg3[0], arg1, arg4);
	}

	@OriginalMember(owner = "client!cv", name = "xa", descriptor = "()F")
	@Override
	public float xa() {
		return this.aFloat19;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4419(@OriginalArg(0) Canvas arg0) {
		@Pc(8) Class2_Sub1 local8 = (Class2_Sub1) this.aClass163_5.method3769((long) arg0.hashCode());
		if (local8 == null) {
			return;
		}
		local8.method5866();
		local8 = Static359.method4895(arg0);
		this.aClass163_5.method3764((long) arg0.hashCode(), local8);
		if (this.aCanvas3 != arg0 || this.aClass17_10 != null) {
			return;
		}
		this.aClass2_Sub1_1 = local8;
		this.lb = local8.anIntArray15;
		this.anInt1264 = local8.anInt132;
		this.anInt1274 = local8.anInt131;
		this.method1095();
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(I)Lclient!u;")
	@Override
	public Class2_Sub17 method4440() {
		return null;
	}

	@OriginalMember(owner = "client!cv", name = "MA", descriptor = "(I)V")
	@Override
	public void MA(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cv", name = "O", descriptor = "(IIIIII)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < this.anInt1266) {
			arg2 -= this.anInt1266 - arg0;
			arg0 = this.anInt1266;
		}
		if (arg1 < this.anInt1281) {
			arg3 -= this.anInt1281 - arg1;
			arg1 = this.anInt1281;
		}
		if (arg0 + arg2 > this.anInt1286) {
			arg2 = this.anInt1286 - arg0;
		}
		if (arg1 + arg3 > this.anInt1279) {
			arg3 = this.anInt1279 - arg1;
		}
		if (arg2 <= 0 || arg3 <= 0 || arg0 > this.anInt1286 || arg1 > this.anInt1279) {
			return;
		}
		@Pc(67) int local67 = this.anInt1264 - arg2;
		@Pc(74) int local74 = arg0 + arg1 * this.anInt1264;
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
						local221 = this.lb[local74];
						local221 = ((local221 & 0xFF00FF) * local90 >> 8 & 0xFF00FF) + ((local221 & 0xFF00) * local90 >> 8 & 0xFF00);
						this.lb[local74++] = local205 + local221;
					}
					local74 += local67;
				}
			} else if (arg5 == 2) {
				for (local90 = 0; local90 < arg3; local90++) {
					for (local94 = -arg2; local94 < 0; local94++) {
						local101 = this.lb[local74];
						local221 = arg4 + local101;
						@Pc(288) int local288 = (arg4 & 0xFF00FF) + (local101 & 0xFF00FF);
						@Pc(298) int local298 = (local288 & 0x1000100) + (local221 - local288 & 0x10000);
						this.lb[local74++] = local221 - local298 | local298 - (local298 >>> 8);
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
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg2++;
					this.lb[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			if (local94 > 0) {
				arg0 = local94;
				do {
					arg2++;
					this.lb[arg2] = arg4;
					arg0--;
				} while (arg0 > 0);
			}
			arg2 += local67;
		}
	}

	@OriginalMember(owner = "client!cv", name = "DA", descriptor = "(IIIIII[BII)V")
	@Override
	public void DA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 <= 0 || arg3 <= 0) {
			return;
		}
		@Pc(6) int local6 = 0;
		@Pc(8) int local8 = 0;
		@Pc(14) int local14 = (arg7 << 16) / arg2;
		@Pc(23) int local23 = (arg6.length / arg7 << 16) / arg3;
		@Pc(30) int local30 = arg0 + arg1 * this.anInt1264;
		@Pc(35) int local35 = this.anInt1264 - arg2;
		if (arg1 + arg3 > this.anInt1279) {
			arg3 -= arg1 + arg3 - this.anInt1279;
		}
		@Pc(59) int local59;
		if (arg1 < this.anInt1281) {
			local59 = this.anInt1281 - arg1;
			arg3 -= local59;
			local30 += local59 * this.anInt1264;
			local8 += local23 * local59;
		}
		if (arg0 + arg2 > this.anInt1286) {
			local59 = arg0 + arg2 - this.anInt1286;
			arg2 -= local59;
			local35 += local59;
		}
		if (arg0 < this.anInt1266) {
			local59 = this.anInt1266 - arg0;
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
						this.lb[local30++] = arg4;
					} else {
						this.lb[local30++] = arg5;
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
					local245 = this.lb[local30];
					this.lb[local30++] = ((local222 & 0xFF00FF) * local236 + (local245 & 0xFF00FF) * local240 & 0xFF00FF00) + ((local222 & 0xFF00) * local236 + (local245 & 0xFF00) * local240 & 0xFF0000) >> 8;
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
						local236 = this.lb[local30];
						local240 = local222 + local236;
						local245 = (local222 & 0xFF00FF) + (local236 & 0xFF00FF);
						@Pc(360) int local360 = (local245 & 0x1000100) + (local240 - local245 & 0x10000);
						this.lb[local30++] = local240 - local360 | local360 - (local360 >>> 8);
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

	@OriginalMember(owner = "client!cv", name = "B", descriptor = "()V")
	@Override
	public void method4477() {
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([IIIII)Lclient!l;")
	@Override
	public Class17 method4422(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(1) boolean local1 = false;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < arg3; local5++) {
			for (@Pc(8) int local8 = 0; local8 < arg2; local8++) {
				@Pc(16) int local16 = arg0[local3++] >>> 24;
				if (local16 != 0 && local16 != 255) {
					local1 = true;
					return local1 ? new Class17_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class17_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
				}
			}
		}
		return local1 ? new Class17_Sub1_Sub3(this, arg0, 0, arg1, arg2, arg3) : new Class17_Sub1_Sub2(this, arg0, 0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([Lclient!t;Lclient!c;[Lclient!ii;I)V")
	@Override
	public void method4409(@OriginalArg(0) Class91[] arg0, @OriginalArg(1) Class35 arg1, @OriginalArg(2) Class8_Sub4[] arg2, @OriginalArg(3) int arg3) {
		@Pc(3) Class91_Sub1[] local3 = new Class91_Sub1[arg0.length];
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5] != null) {
				local3[local5] = (Class91_Sub1) arg0[local5];
			}
		}
		@Pc(26) Class91_Sub1 local26 = Static122.method2159(this, local3);
		local26.method2153(arg1, arg2 == null ? null : arg2[0], null, arg3);
	}

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "()Z")
	@Override
	public boolean method4450() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	@Override
	public void method4407(@OriginalArg(0) int arg0) {
		this.aClass52Array1[arg0].method1148(Thread.currentThread());
	}

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "(I)Z")
	public boolean method1093(@OriginalArg(0) int arg0) {
		return super.anInterface4_6.method3794(arg0).aBoolean290;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(IIIII)V")
	@Override
	public void b(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 < this.anInt1281 || arg1 >= this.anInt1279) {
			return;
		}
		if (arg0 < this.anInt1266) {
			arg2 -= this.anInt1266 - arg0;
			arg0 = this.anInt1266;
		}
		if (arg0 + arg2 > this.anInt1286) {
			arg2 = this.anInt1286 - arg0;
		}
		@Pc(40) int local40 = arg0 + arg1 * this.anInt1264;
		@Pc(44) int local44 = arg3 >>> 24;
		@Pc(54) int local54;
		if (arg4 == 0 || arg4 == 1 && local44 == 255) {
			for (local54 = 0; local54 < arg2; local54++) {
				this.lb[local40 + local54] = arg3;
			}
			return;
		}
		@Pc(100) int local100;
		@Pc(108) int local108;
		if (arg4 == 1) {
			@Pc(94) int local94 = ((arg3 & 0xFF00FF) * local44 >> 8 & 0xFF00FF) + ((arg3 & 0xFF00) * local44 >> 8 & 0xFF00) + (local44 << 24);
			local54 = 256 - local44;
			for (local100 = 0; local100 < arg2; local100++) {
				local108 = this.lb[local40 + local100];
				local108 = ((local108 & 0xFF00FF) * local54 >> 8 & 0xFF00FF) + ((local108 & 0xFF00) * local54 >> 8 & 0xFF00);
				this.lb[local40 + local100] = local94 + local108;
			}
		} else if (arg4 == 2) {
			for (local54 = 0; local54 < arg2; local54++) {
				local100 = this.lb[local40 + local54];
				local108 = arg3 + local100;
				@Pc(167) int local167 = (arg3 & 0xFF00FF) + (local100 & 0xFF00FF);
				@Pc(177) int local177 = (local167 & 0x1000100) + (local108 - local167 & 0x10000);
				this.lb[local40 + local54] = local108 - local177 | local177 - (local177 >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cv", name = "W", descriptor = "()F")
	@Override
	public float W() {
		return this.aFloat20;
	}

	@OriginalMember(owner = "client!cv", name = "j", descriptor = "()I")
	@Override
	public int method4433() {
		return 0;
	}

	@OriginalMember(owner = "client!cv", name = "B", descriptor = "(F)V")
	@Override
	public void B(@OriginalArg(0) float arg0) {
		this.anInt1267 = (int) (arg0 * 65535.0F);
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(IIIIII)Lclient!mh;")
	@Override
	public Class155 method4461(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return null;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIILclient!ma;II)V")
	@Override
	public void method4472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class73 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(2) Class73_Sub1 local2 = (Class73_Sub1) arg5;
		@Pc(5) int[] local5 = local2.anIntArray181;
		@Pc(8) int[] local8 = local2.anIntArray182;
		@Pc(17) int local17 = this.anInt1281 > arg7 ? this.anInt1281 : arg7;
		@Pc(32) int local32 = this.anInt1279 < arg7 + local5.length ? this.anInt1279 : arg7 + local5.length;
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
					if (local129 >= this.anInt1266 && local129 < this.anInt1286 && local129 >= local145 && local129 < local145 + local8[local133]) {
						this.lb[local129 + arg1 * this.anInt1264] = arg4;
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
					if (local133 >= this.anInt1266 && local133 < this.anInt1286 && local133 >= local226 && local133 < local226 + local8[local145]) {
						local243 = local133 + arg1 * this.anInt1264;
						local248 = this.lb[local243];
						@Pc(584) int local584 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
						this.lb[local133 + arg1 * this.anInt1264] = local201 + local584;
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
		if (arg0 < this.anInt1266) {
			arg1 += local83 * (this.anInt1266 - arg0);
			arg0 = this.anInt1266;
		}
		if (arg2 >= this.anInt1286) {
			arg2 = this.anInt1286 - 1;
		}
		local116 = arg4 >>> 24;
		if (local116 == 255) {
			while (arg0 <= arg2) {
				local129 = arg1 >> 16;
				local133 = local129 - arg7;
				if (local129 >= local17 && local129 < local32) {
					local145 = arg6 + local5[local133];
					if (arg0 >= local145 && arg0 < local145 + local8[local133]) {
						this.lb[arg0 + local129 * this.anInt1264] = arg4;
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
					local243 = arg0 + local133 * this.anInt1264;
					local248 = this.lb[local243];
					local248 = ((local248 & 0xFF00FF) * local129 >> 8 & 0xFF00FF) + ((local248 & 0xFF00) * local129 >> 8 & 0xFF00);
					this.lb[local243] = local201 + local248;
				}
			}
			arg1 += local83;
			arg0++;
		}
	}

	@OriginalMember(owner = "client!cv", name = "GA", descriptor = "(IIII)V")
	@Override
	public void GA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1270 = arg0;
		this.anInt1285 = arg1;
		this.anInt1277 = arg2;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!pn;)V")
	@Override
	public void method4471(@OriginalArg(0) Class194 arg0) {
		@Pc(3) Class8_Sub2 local3 = arg0.aClass191_1.aClass8_Sub2_5;
		for (@Pc(6) Class8_Sub2 local6 = local3.aClass8_Sub2_8; local6 != local3; local6 = local6.aClass8_Sub2_8) {
			@Pc(10) Class8_Sub2_Sub1 local10 = (Class8_Sub2_Sub1) local6;
			@Pc(15) int local15 = local10.anInt7352 >> 12;
			@Pc(20) int local20 = local10.anInt7354 >> 12;
			@Pc(25) int local25 = local10.anInt7356 >> 12;
			@Pc(49) int local49 = this.aClass35_Sub1_1.anInt5521 + (this.aClass35_Sub1_1.anInt5529 * local15 + this.aClass35_Sub1_1.anInt5526 * local20 + this.aClass35_Sub1_1.anInt5520 * local25 >> 15);
			if (local49 >= this.anInt1282 && local49 <= this.anInt1265) {
				@Pc(90) int local90 = this.anInt1278 + this.anInt1280 * (this.aClass35_Sub1_1.anInt5523 + (this.aClass35_Sub1_1.anInt5519 * local15 + this.aClass35_Sub1_1.anInt5522 * local20 + this.aClass35_Sub1_1.anInt5527 * local25 >> 15)) / local49;
				@Pc(122) int local122 = this.anInt1269 + this.anInt1283 * (this.aClass35_Sub1_1.anInt5525 + (this.aClass35_Sub1_1.anInt5524 * local15 + this.aClass35_Sub1_1.anInt5518 * local20 + this.aClass35_Sub1_1.anInt5528 * local25 >> 15)) / local49;
				if (local90 >= this.anInt1266 && local90 <= this.anInt1286 && local122 >= this.anInt1281 && local122 <= this.anInt1279) {
					if (local49 == 0) {
						local49 = 1;
					}
					this.method1089(local10, local90, local122, (local10.anInt7351 >> 2) / local49);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4460(@OriginalArg(0) Canvas arg0) {
		if (this.aCanvas3 == arg0) {
			this.method4436(null);
		}
		@Pc(15) Class2_Sub1 local15 = (Class2_Sub1) this.aClass163_5.method3769((long) arg0.hashCode());
		if (local15 != null) {
			local15.method5866();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!mh;)V")
	@Override
	public void method4470(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
	@Override
	public void method4436(@OriginalArg(0) Canvas arg0) {
		if (arg0 == null) {
			this.aCanvas3 = null;
			this.aClass2_Sub1_1 = null;
			if (this.aClass17_10 == null) {
				this.lb = null;
				this.anInt1264 = this.anInt1274 = 1;
				this.method1095();
			}
			return;
		}
		@Pc(10) Class2_Sub1 local10 = (Class2_Sub1) this.aClass163_5.method3769((long) arg0.hashCode());
		if (local10 == null) {
			return;
		}
		this.aCanvas3 = arg0;
		this.aClass2_Sub1_1 = local10;
		if (this.aClass17_10 != null) {
			return;
		}
		this.lb = local10.anIntArray15;
		this.anInt1264 = local10.anInt132;
		this.anInt1274 = local10.anInt131;
		this.method1095();
		return;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(IIIIII)V")
	@Override
	public void method4449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg2 -= arg0;
		arg3 -= arg1;
		if (arg3 == 0) {
			if (arg2 >= 0) {
				this.b(arg0, arg1, arg2 + 1, arg4, arg5);
			} else {
				this.b(arg0 + arg2, arg1, 1 - arg2, arg4, arg5);
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
				if (arg0 < this.anInt1266) {
					arg1 += local104 * (this.anInt1266 - arg0);
					arg0 = this.anInt1266;
				}
				if (arg2 >= this.anInt1286) {
					arg2 = this.anInt1286 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg0 <= arg2) {
						local150 = arg1 >> 16;
						if (local150 >= this.anInt1281 && local150 < this.anInt1279) {
							this.lb[arg0 + local150 * this.anInt1264] = arg4;
						}
						arg1 += local104;
						arg0++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg0 <= arg2) {
						local213 = arg1 >> 16;
						if (local213 >= this.anInt1281 && local213 < this.anInt1279) {
							local228 = arg0 + local213 * this.anInt1264;
							local233 = this.lb[local228];
							local233 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.lb[local228] = local204 + local233;
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
				if (arg1 < this.anInt1281) {
					arg0 += local104 * (this.anInt1281 - arg1);
					arg1 = this.anInt1281;
				}
				if (arg3 >= this.anInt1279) {
					arg3 = this.anInt1279 - 1;
				}
				local137 = arg4 >>> 24;
				if (arg5 == 0 || arg5 == 1 && local137 == 255) {
					while (arg1 <= arg3) {
						local150 = arg0 >> 16;
						if (local150 >= this.anInt1266 && local150 < this.anInt1286) {
							this.lb[local150 + arg1 * this.anInt1264] = arg4;
						}
						arg0 += local104;
						arg1++;
					}
				} else if (arg5 == 1) {
					local204 = ((arg4 & 0xFF00FF) * local137 >> 8 & 0xFF00FF) + ((arg4 & 0xFF00) * local137 >> 8 & 0xFF00) + (local137 << 24);
					local150 = 256 - local137;
					while (arg1 <= arg3) {
						local213 = arg0 >> 16;
						if (local213 >= this.anInt1266 && local213 < this.anInt1286) {
							local228 = local213 + arg1 * this.anInt1264;
							local233 = this.lb[local228];
							@Pc(516) int local516 = ((local233 & 0xFF00FF) * local150 >> 8 & 0xFF00FF) + ((local233 & 0xFF00) * local150 >> 8 & 0xFF00);
							this.lb[local213 + arg1 * this.anInt1264] = local204 + local516;
						}
						arg0 += local104;
						arg1++;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		} else if (arg3 >= 0) {
			this.TA(arg0, arg1, arg3 + 1, arg4, arg5);
		} else {
			this.TA(arg0, arg1 + arg3, -arg3 + 1, arg4, arg5);
		}
	}

	@OriginalMember(owner = "client!cv", name = "x", descriptor = "()Z")
	@Override
	public boolean method4466() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(II)I")
	@Override
	public int method4451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "()V")
	@Override
	public void method4432() {
	}

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "(I)Z")
	public boolean method1094(@OriginalArg(0) int arg0) {
		return this.aBoolean75 || super.anInterface4_6.method3794(arg0).aBoolean286;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!t;Lclient!pn;Lclient!c;Lclient!ii;I)V")
	@Override
	public void method4468(@OriginalArg(0) Class91 arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) Class35 arg2, @OriginalArg(3) Class8_Sub4 arg3) {
		((Class91_Sub1) arg0).method2153(arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIII)V")
	@Override
	public void method4463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
	}

	@OriginalMember(owner = "client!cv", name = "E", descriptor = "()V")
	private void method1095() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt1284; local1++) {
			this.aClass52Array1[local1].method1153();
		}
		this.e();
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIIIIII)V")
	@Override
	public void method4482() {
		@Pc(3) Class52 local3 = this.method1088(Thread.currentThread());
		@Pc(6) Class21 local6 = local3.aClass21_1;
		local6.aBoolean24 = false;
		local6.aBoolean24 = false;
		local6.anInt556 = 0;
		local6.aBoolean23 = true;
		local6.method479(10, 50, 90, 5, 75, 15, -65536, -65536, -65536);
		local6.aBoolean24 = true;
	}

	@OriginalMember(owner = "client!cv", name = "g", descriptor = "()Z")
	@Override
	public boolean method4425() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "ea", descriptor = "(Lclient!c;)V")
	@Override
	public void ea(@OriginalArg(0) Class35 arg0) {
		this.aClass35_Sub1_1 = (Class35_Sub1) arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II[[I[[IIII)Lclient!ta;")
	@Override
	public Class64 method4462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		return new Class64_Sub2(this, arg4, arg5, arg0, arg1, arg2, arg3, 128);
	}

	@OriginalMember(owner = "client!cv", name = "AA", descriptor = "(IIII)V")
	@Override
	public void AA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt1261 = this.anInt1285;
		this.anInt1270 = arg0;
		this.anInt1285 = arg1;
		this.anInt1277 = arg2;
		this.aBoolean74 = true;
	}

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "()V")
	@Override
	public void e() {
		this.anInt1266 = 0;
		this.anInt1281 = 0;
		this.anInt1286 = this.anInt1264;
		this.anInt1279 = this.anInt1274;
		this.method1090();
	}

	@OriginalMember(owner = "client!cv", name = "IA", descriptor = "()I")
	@Override
	public int IA() {
		return 0;
	}

	@OriginalMember(owner = "client!cv", name = "ca", descriptor = "(ILclient!ma;II)V")
	@Override
	public void ca(@OriginalArg(0) int arg0, @OriginalArg(1) Class73 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class73_Sub1 local2 = (Class73_Sub1) arg1;
		@Pc(5) int[] local5 = local2.anIntArray181;
		@Pc(8) int[] local8 = local2.anIntArray182;
		@Pc(20) int local20;
		if (this.anInt1279 < arg3 + local5.length) {
			local20 = this.anInt1279 - arg3;
		} else {
			local20 = local5.length;
		}
		@Pc(33) int local33;
		if (this.anInt1281 > arg3) {
			local33 = this.anInt1281 - arg3;
			arg3 = this.anInt1281;
		} else {
			local33 = 0;
		}
		if (local20 - local33 <= 0) {
			return;
		}
		@Pc(49) int local49 = arg3 * this.anInt1264;
		for (@Pc(51) int local51 = local33; local51 < local20; local51++) {
			@Pc(58) int local58 = arg2 + local5[local51];
			@Pc(62) int local62 = local8[local51];
			if (this.anInt1266 > local58) {
				local62 -= this.anInt1266 - local58;
				local58 = this.anInt1266;
			}
			if (this.anInt1286 < local58 + local62) {
				local62 = this.anInt1286 - local58;
			}
			local58 += local49;
			for (@Pc(94) int local94 = -local62; local94 < 0; local94++) {
				this.lb[local58++] = arg0;
			}
			local49 += this.anInt1264;
		}
	}

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "()V")
	@Override
	public void method4412() {
		if (this.aCanvas3 == null || this.aClass2_Sub1_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			this.aClass2_Sub1_1.method151(local14);
		} catch (@Pc(23) Exception local23) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I[Lclient!jd;)V")
	@Override
	public void method4428(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20[] arg1) {
	}

	@OriginalMember(owner = "client!cv", name = "F", descriptor = "()Z")
	public boolean method1096() {
		return this.aBoolean72;
	}

	@OriginalMember(owner = "client!cv", name = "f", descriptor = "()V")
	@Override
	protected void method4420() {
		if (this.aBoolean71) {
			Static313.method4399(true, false);
			this.aBoolean71 = false;
		}
		this.aClass2_Sub1_1 = null;
		this.aCanvas3 = null;
		this.aClass163_5 = null;
		this.aBoolean72 = true;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "()I")
	@Override
	public int a() {
		return this.anInt1282;
	}

	@OriginalMember(owner = "client!cv", name = "A", descriptor = "()V")
	@Override
	public void method4475() {
	}

	@OriginalMember(owner = "client!cv", name = "G", descriptor = "()V")
	private void method1097() {
		if (this.aFloat19 == 0.0F) {
			this.anInt1258 = this.anInt1288;
			return;
		}
		@Pc(8) float local8 = (float) this.anInt1288;
		@Pc(12) float local12 = (float) this.anInt1282;
		@Pc(23) float local23 = -(local12 * 2.0F * local8) / (local8 - local12);
		@Pc(32) float local32 = this.aFloat20 / (this.aFloat19 + this.aFloat20);
		@Pc(36) float local36 = local32 * local32;
		@Pc(50) float local50 = -local23 * (1.0F - local32) * (1.0F - local32) / this.aFloat19;
		this.anInt1258 = (int) (((float) this.anInt1288 - local23 * local36) / ((local8 + local12) / (local8 - local12) - local50) + 0.5F);
	}

	@OriginalMember(owner = "client!cv", name = "C", descriptor = "()V")
	@Override
	public void method4483() {
	}

	@OriginalMember(owner = "client!cv", name = "NA", descriptor = "(IIIII)V")
	@Override
	protected void NA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = -arg2;
		}
		@Pc(8) int local8 = arg1 - arg2;
		if (local8 < this.anInt1281) {
			local8 = this.anInt1281;
		}
		@Pc(21) int local21 = arg1 + arg2 + 1;
		if (local21 > this.anInt1279) {
			local21 = this.anInt1279;
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
				if (local91 < this.anInt1266) {
					local91 = this.anInt1266;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1286) {
					local102 = this.anInt1286;
				}
				local116 = local91 + local30 * this.anInt1264;
				for (local118 = local91; local118 < local102; local118++) {
					this.lb[local116++] = arg3;
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
				if (local91 < this.anInt1266) {
					local91 = this.anInt1266;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1286 - 1) {
					local102 = this.anInt1286 - 1;
				}
				local116 = local91 + local30 * this.anInt1264;
				for (local118 = local91; local118 <= local102; local118++) {
					this.lb[local116++] = arg3;
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
				if (local102 < this.anInt1266) {
					local102 = this.anInt1266;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1286) {
					local116 = this.anInt1286;
				}
				local118 = local102 + local30 * this.anInt1264;
				for (local334 = local102; local334 < local116; local334++) {
					local340 = this.lb[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.lb[local118++] = local277 + local340;
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
				if (local102 < this.anInt1266) {
					local102 = this.anInt1266;
				}
				local116 = arg0 + local36;
				if (local116 > this.anInt1286 - 1) {
					local116 = this.anInt1286 - 1;
				}
				local118 = local102 + local30 * this.anInt1264;
				for (local334 = local102; local334 <= local116; local334++) {
					local340 = this.lb[local118];
					local340 = ((local340 & 0xFF00FF) * local91 >> 8 & 0xFF00FF) + ((local340 & 0xFF00) * local91 >> 8 & 0xFF00);
					this.lb[local118++] = local277 + local340;
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
				if (local91 < this.anInt1266) {
					local91 = this.anInt1266;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1286) {
					local102 = this.anInt1286;
				}
				local116 = local91 + local30 * this.anInt1264;
				for (local118 = local91; local118 < local102; local118++) {
					local334 = this.lb[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					@Pc(603) int local603 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.lb[local116++] = local340 - local603 | local603 - (local603 >>> 8);
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
				if (local91 < this.anInt1266) {
					local91 = this.anInt1266;
				}
				local102 = arg0 + local36;
				if (local102 > this.anInt1286 - 1) {
					local102 = this.anInt1286 - 1;
				}
				local116 = local91 + local30 * this.anInt1264;
				for (local118 = local91; local118 <= local102; local118++) {
					local334 = this.lb[local116];
					local340 = arg3 + local334;
					local593 = (arg3 & 0xFF00FF) + (local334 & 0xFF00FF);
					local334 = (local593 & 0x1000100) + (local340 - local593 & 0x10000);
					this.lb[local116++] = local340 - local334 | local334 - (local334 >>> 8);
				}
				local30++;
				local48 += local40 + local40;
				local44 += local40++ + local40;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIIIII)V")
	public void method1098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg2 == 0 || arg3 == 0) {
			return;
		}
		if (arg5 == 65535 || super.anInterface4_6.method3794(arg5).aBoolean293) {
			this.NA(arg0, arg1, arg2, arg6, arg8);
			return;
		}
		if (this.anInt1289 != arg5) {
			@Pc(26) Class17 local26 = (Class17) this.aClass171_7.method3941((long) arg5);
			if (local26 == null) {
				@Pc(32) int[] local32 = this.method1087(arg5);
				if (local32 == null) {
					return;
				}
				@Pc(43) int local43 = this.method1094(arg5) ? 64 : 128;
				local26 = this.method4422(local32, local43, local43, local43);
				this.aClass171_7.method3940((long) arg5, local26);
			}
			this.anInt1289 = arg5;
			this.aClass17_11 = local26;
		}
		this.aClass17_11.s(arg0 - arg2, arg1 - arg3, arg2 << 1, arg3 << 1, arg7, arg6, arg8);
	}

	@OriginalMember(owner = "client!cv", name = "e", descriptor = "(I)V")
	@Override
	public void method4446(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - this.anInt1257;
		for (@Pc(9) Object local9 = this.aClass171_6.method3939(); local9 != null; local9 = this.aClass171_6.method3931()) {
			@Pc(13) Class2_Sub45 local13 = (Class2_Sub45) local9;
			if (local13.aBoolean479) {
				local13.anInt7264 += local4;
				@Pc(27) int local27 = local13.anInt7264 / 20;
				if (local27 > 0) {
					@Pc(36) Class140 local36 = super.anInterface4_6.method3794(local13.anInt7266);
					local13.method5730(local36.aByte60 * local4 * 50 / 1000, local36.aByte63 * local4 * 50 / 1000);
					local13.anInt7264 -= local27 * 20;
				}
				local13.aBoolean479 = false;
			}
		}
		this.anInt1257 = arg0;
		this.aClass171_7.method3933(5);
	}

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "(I)[I")
	public int[] method1099(@OriginalArg(0) int arg0) {
		@Pc(2) Class171 local2 = this.aClass171_6;
		@Pc(12) Class2_Sub45 local12;
		synchronized (this.aClass171_6) {
			local12 = (Class2_Sub45) this.aClass171_6.method3941((long) arg0);
			if (local12 == null) {
				if (!super.anInterface4_6.method3792(arg0)) {
					return null;
				}
				@Pc(32) Class140 local32 = super.anInterface4_6.method3794(arg0);
				@Pc(42) int local42 = local32.aBoolean286 || this.aBoolean75 ? 64 : 128;
				local12 = new Class2_Sub45(arg0, local42, super.anInterface4_6.method3790(local42, arg0, 0.7F, true, local42), local32.aBoolean292);
				this.aClass171_6.method3940((long) arg0, local12);
			}
		}
		local12.aBoolean479 = true;
		return local12.method5729();
	}

	@OriginalMember(owner = "client!cv", name = "k", descriptor = "()Z")
	@Override
	public boolean method4439() {
		return false;
	}

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "()V")
	@Override
	public void method4417() {
		this.aClass171_6.method3936();
	}

	@OriginalMember(owner = "client!cv", name = "F", descriptor = "(IIII)[I")
	@Override
	public int[] F(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(4) int[] local4 = new int[arg2 * arg3];
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < arg3; local8++) {
			@Pc(18) int local18 = (arg1 + local8) * this.anInt1264 + arg0;
			for (@Pc(20) int local20 = 0; local20 < arg2; local20++) {
				local4[local6++] = this.lb[local18 + local20];
			}
		}
		return local4;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)I")
	@Override
	public int method4429(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 | 0x20800;
		return local3 & arg1 ^ arg1;
	}

	@OriginalMember(owner = "client!cv", name = "m", descriptor = "()Z")
	@Override
	public boolean method4442() {
		return true;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!ft;Z)Lclient!l;")
	@Override
	public Class17 method4435(@OriginalArg(0) Class85 arg0) {
		@Pc(2) int[] local2 = arg0.anIntArray206;
		@Pc(5) byte[] local5 = arg0.aByteArray51;
		@Pc(8) int local8 = arg0.anInt2652;
		@Pc(11) int local11 = arg0.anInt2649;
		@Pc(76) Class17_Sub1 local76;
		@Pc(20) int[] local20;
		@Pc(25) byte[] local25;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(34) int local34;
		if (arg0.aByteArray52 == null) {
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
			local76 = new Class17_Sub1_Sub1(this, local25, local20, local8, local11);
		} else {
			local20 = new int[local8 * local11];
			local25 = arg0.aByteArray52;
			if (local25 == null) {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF];
					}
				}
				new Class17_Sub1_Sub3(this, local20, local8, local11);
				local76 = new Class17_Sub1_Sub2(this, local20, local8, local11);
			} else {
				for (local27 = 0; local27 < local11; local27++) {
					local32 = local27 * local8;
					for (local34 = 0; local34 < local8; local34++) {
						local20[local32 + local34] = local2[local5[local32 + local34] & 0xFF] | local25[local32 + local34] << 24;
					}
				}
				local76 = new Class17_Sub1_Sub3(this, local20, local8, local11);
			}
		}
		local76.MA(arg0.anInt2650, arg0.anInt2647, arg0.anInt2651, arg0.anInt2648);
		return local76;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
	@Override
	public void method4411(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) {
		if (this.aCanvas3 == null || this.aClass2_Sub1_1 == null) {
			throw new IllegalStateException("off");
		}
		try {
			@Pc(14) Graphics local14 = this.aCanvas3.getGraphics();
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				@Pc(21) Rectangle local21 = arg0[local16];
				if (local21.x <= this.anInt1264 && local21.y <= this.anInt1274 && local21.x + local21.width > 0 && local21.y + local21.height > 0) {
					this.aClass2_Sub1_1.method148(local21.y, local21.height, local21.width, local21.x, local14);
				}
			}
		} catch (@Pc(63) Exception local63) {
			this.aCanvas3.repaint();
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V")
	@Override
	public void method4416(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!mh;Lclient!mh;FLclient!mh;)Lclient!mh;")
	@Override
	public Class155 method4443(@OriginalArg(0) Class155 arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Class155 arg3) {
		return null;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) Class52 local3 = this.method1088(Thread.currentThread());
		@Pc(6) Class21 local6 = local3.aClass21_1;
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
		@Pc(93) int local93 = arg0 - local6.method473();
		@Pc(98) int local98 = arg1 - local6.method468();
		@Pc(102) int local102 = local93 + local66;
		@Pc(106) int local106 = local93 - local74;
		@Pc(112) int local112 = local93 + local10 - local74;
		@Pc(118) int local118 = local93 + local10 + local66;
		@Pc(122) int local122 = local98 + local80;
		@Pc(126) int local126 = local98 - local88;
		@Pc(132) int local132 = local98 + local14 - local88;
		@Pc(138) int local138 = local98 + local14 + local80;
		local6.anInt556 = 0;
		local6.aBoolean23 = local102 < 0 || local102 > local6.anInt551 || local106 < 0 || local106 > local6.anInt551 || local112 < 0 || local112 > local6.anInt551;
		local6.method467(local122, local126, local132, local102, local106, local112, arg4);
		local6.aBoolean23 = local102 < 0 || local102 > local6.anInt551 || local106 < 0 || local106 > local6.anInt551 || local118 < 0 || local118 > local6.anInt551;
		local6.method467(local122, local132, local138, local102, local112, local118, arg4);
	}

	@OriginalMember(owner = "client!cv", name = "X", descriptor = "(III[I)V")
	@Override
	public void X(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		@Pc(23) int local23 = this.aClass35_Sub1_1.anInt5521 + (this.aClass35_Sub1_1.anInt5529 * arg0 + this.aClass35_Sub1_1.anInt5526 * arg1 + this.aClass35_Sub1_1.anInt5520 * arg2 >> 15);
		if (local23 < this.anInt1282 || local23 > this.anInt1288) {
			arg3[0] = arg3[1] = arg3[2] = -1;
			return;
		}
		@Pc(73) int local73 = this.anInt1280 * (this.aClass35_Sub1_1.anInt5523 + (this.aClass35_Sub1_1.anInt5519 * arg0 + this.aClass35_Sub1_1.anInt5522 * arg1 + this.aClass35_Sub1_1.anInt5527 * arg2 >> 15)) / local23;
		@Pc(102) int local102 = this.anInt1283 * (this.aClass35_Sub1_1.anInt5525 + (this.aClass35_Sub1_1.anInt5524 * arg0 + this.aClass35_Sub1_1.anInt5518 * arg1 + this.aClass35_Sub1_1.anInt5528 * arg2 >> 15)) / local23;
		if (local73 >= this.anInt1259 && local73 <= this.anInt1287 && local102 >= this.anInt1273 && local102 <= this.anInt1276) {
			arg3[0] = local73 - this.anInt1259;
			arg3[1] = local102 - this.anInt1273;
			arg3[2] = local23;
		} else {
			arg3[0] = arg3[1] = arg3[2] = -1;
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Lclient!dq;[Lclient!ft;Z)Lclient!la;")
	@Override
	public Class116 method4479(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class85[] arg1) {
		@Pc(3) int[] local3 = new int[arg1.length];
		@Pc(7) int[] local7 = new int[arg1.length];
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			local3[local11] = arg1[local11].anInt2652;
			local7[local11] = arg1[local11].anInt2649;
			if (arg1[local11].aByteArray52 != null) {
			}
		}
		return new Class116_Sub3(this, arg0, arg1, local3, local7);
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.b(arg0, arg1, arg2, arg4, arg5);
		this.b(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
		this.TA(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
		this.TA(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
	}

	@OriginalMember(owner = "client!cv", name = "ZA", descriptor = "()I")
	@Override
	public int ZA() {
		@Pc(2) int local2 = this.anInt1260;
		this.anInt1260 = 0;
		return local2;
	}
}
