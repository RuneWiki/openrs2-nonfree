import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class86_Sub1 extends Class86 {

	@OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
	private int anInt4251;

	@OriginalMember(owner = "client!v", name = "qb", descriptor = "[Z")
	private volatile boolean[] aBooleanArray27;

	@OriginalMember(owner = "client!v", name = "wb", descriptor = "I")
	private int anInt4257;

	@OriginalMember(owner = "client!v", name = "sb", descriptor = "I")
	private int anInt4255 = -1;

	@OriginalMember(owner = "client!v", name = "gb", descriptor = "Z")
	private volatile boolean aBoolean200 = false;

	@OriginalMember(owner = "client!v", name = "tb", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!v", name = "ub", descriptor = "Lclient!vg;")
	private Class123 aClass123_8;

	@OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
	private int anInt4252;

	@OriginalMember(owner = "client!v", name = "fb", descriptor = "Lclient!vg;")
	private Class123 aClass123_7;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!vg;Lclient!vg;IZZZ)V")
	public Class86_Sub1(@OriginalArg(0) Class123 arg0, @OriginalArg(1) Class123 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.aBoolean201 = arg5;
		this.aClass123_8 = arg1;
		this.anInt4252 = arg2;
		this.aClass123_7 = arg0;
		Static18.method269(this, this.anInt4252);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method3315(@OriginalArg(0) int arg0) {
		if (!this.method3328(arg0)) {
			return;
		}
		if (this.aClass123_7 == null || this.aBooleanArray27 == null || !this.aBooleanArray27[arg0]) {
			Static104.method1598(true, arg0, (byte) 2, this.anInt4252, this, super.anIntArray487[arg0]);
		} else {
			Static197.method3486(this, this.aClass123_7, arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(BI)V")
	@Override
	protected void method3330(@OriginalArg(1) int arg0) {
		if (this.method3328(arg0)) {
			Static23.method335(this.anInt4252, arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZZ[BILclient!vg;)V")
	public void method3342(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class123 arg3) {
		@Pc(39) int local39;
		if (arg3 != this.aClass123_8) {
			if (!arg0 && this.anInt4255 == arg2) {
				this.aBoolean200 = true;
			}
			if (arg1 == null || arg1.length <= 2) {
				this.aBooleanArray27[arg2] = false;
				if (this.aBoolean201 || arg0) {
					Static104.method1598(arg0, arg2, (byte) 2, this.anInt4252, this, super.anIntArray487[arg2]);
				}
				return;
			}
			Static42.aCRC32_1.reset();
			Static42.aCRC32_1.update(arg1, 0, arg1.length - 2);
			local39 = (int) Static42.aCRC32_1.getValue();
			@Pc(210) int local210 = (arg1[arg1.length - 1] & 0xFF) + ((arg1[arg1.length - 2] & 0xFF) << 8);
			if (local39 != super.anIntArray487[arg2] || super.anIntArray486[arg2] != local210) {
				this.aBooleanArray27[arg2] = false;
				if (this.aBoolean201 || arg0) {
					Static104.method1598(arg0, arg2, (byte) 2, this.anInt4252, this, super.anIntArray487[arg2]);
				}
				return;
			}
			this.aBooleanArray27[arg2] = true;
			if (arg0) {
				super.anObjectArray32[arg2] = Static16.method230(arg1);
			}
			return;
		}
		if (this.aBoolean200) {
			throw new RuntimeException();
		}
		if (arg1 == null) {
			Static104.method1598(true, this.anInt4252, (byte) 0, 255, this, this.anInt4257);
			return;
		}
		Static42.aCRC32_1.reset();
		Static42.aCRC32_1.update(arg1, 0, arg1.length);
		local39 = (int) Static42.aCRC32_1.getValue();
		if (this.anInt4257 != local39) {
			Static104.method1598(true, this.anInt4252, (byte) 0, 255, this, this.anInt4257);
			return;
		}
		@Pc(61) Class1_Sub17 local61;
		try {
			local61 = new Class1_Sub17(Static151.method2538(arg1));
		} catch (@Pc(63) RuntimeException local63) {
			Static104.method1598(true, this.anInt4252, (byte) 0, 255, this, this.anInt4257);
			return;
		}
		@Pc(78) int local78 = local61.method2142();
		if (local78 != 5 && local78 != 6) {
			Static104.method1598(true, this.anInt4252, (byte) 0, 255, this, this.anInt4257);
			return;
		}
		@Pc(99) int local99 = 0;
		if (local78 >= 6) {
			local99 = local61.method2140();
		}
		if (this.anInt4251 != local99) {
			Static104.method1598(true, this.anInt4252, (byte) 0, 255, this, this.anInt4257);
			return;
		}
		this.method3311(arg1);
		this.method3344();
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)I")
	public int method3343() {
		if (this.aBoolean200) {
			return 100;
		} else if (super.anObjectArray32 == null) {
			@Pc(29) int local29 = Static10.method159(255, this.anInt4252);
			if (local29 >= 100) {
				local29 = 99;
			}
			return local29;
		} else {
			return 99;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	private void method3344() {
		this.aBooleanArray27 = new boolean[super.anObjectArray32.length];
		for (@Pc(18) int local18 = 0; local18 < this.aBooleanArray27.length; local18++) {
			this.aBooleanArray27[local18] = false;
		}
		if (this.aClass123_7 == null) {
			this.aBoolean200 = true;
			return;
		}
		this.anInt4255 = -1;
		for (@Pc(43) int local43 = 0; local43 < this.aBooleanArray27.length; local43++) {
			if (super.anIntArray485[local43] > 0) {
				Static205.method3252(this, local43, this.aClass123_7);
				this.anInt4255 = local43;
			}
		}
		if (this.anInt4255 == -1) {
			this.aBoolean200 = true;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ZIZ[BZ)V")
	public void method3346(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg3) {
			if (this.aBoolean200) {
				throw new RuntimeException();
			}
			if (this.aClass123_8 != null) {
				Static76.method1103(this.anInt4252, this.aClass123_8, arg2);
			}
			this.method3311(arg2);
			this.method3344();
			return;
		}
		arg2[arg2.length - 2] = (byte) (super.anIntArray486[arg0] >> 8);
		arg2[arg2.length - 1] = (byte) super.anIntArray486[arg0];
		if (this.aClass123_7 != null) {
			Static76.method1103(arg0, this.aClass123_7, arg2);
			this.aBooleanArray27[arg0] = true;
		}
		if (arg1) {
			super.anObjectArray32[arg0] = Static16.method230(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)I")
	@Override
	protected int method3313(@OriginalArg(1) int arg0) {
		if (!this.method3328(arg0)) {
			return 0;
		} else if (super.anObjectArray32[arg0] == null) {
			return this.aBooleanArray27[arg0] ? 100 : Static10.method159(this.anInt4252, arg0);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZ)V")
	public void method3350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4257 = arg1;
		this.anInt4251 = arg0;
		if (this.aClass123_8 == null) {
			Static104.method1598(true, this.anInt4252, (byte) 0, 255, this, this.anInt4257);
		} else {
			Static197.method3486(this, this.aClass123_8, this.anInt4252);
		}
	}
}
