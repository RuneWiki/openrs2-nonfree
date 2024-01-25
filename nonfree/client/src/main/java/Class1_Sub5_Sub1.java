import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class1_Sub5_Sub1 extends Class1_Sub5 {

	@OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
	private int anInt4973;

	@OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
	private int anInt4974;

	@OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
	public int anInt4975;

	@OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
	public int anInt4976;

	@OriginalMember(owner = "client!pk", name = "L", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!pk", name = "N", descriptor = "Z")
	public boolean aBoolean371;

	@OriginalMember(owner = "client!pk", name = "P", descriptor = "Z")
	public boolean aBoolean372;

	@OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
	private int anInt4982;

	@OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
	private int anInt4984;

	@OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
	private int anInt4985;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	private Class1_Sub5_Sub1() {
		if (Static344.anIntArray383 == null) {
			Static276.method4928();
		}
		this.method4543();
	}

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lclient!at;)V")
	public Class1_Sub5_Sub1(@OriginalArg(0) Class1_Sub7 arg0) {
		if (Static344.anIntArray383 == null) {
			Static276.method4928();
		}
		this.anInt4976 = arg0.method2132();
		this.aBoolean372 = (this.anInt4976 & 0x10) != 0;
		this.aBoolean371 = (this.anInt4976 & 0x8) != 0;
		this.anInt4976 &= 0x7;
		super.anInt4966 = arg0.method2161();
		super.anInt4965 = arg0.method2161();
		super.anInt4967 = arg0.method2161();
		super.anInt4963 = arg0.method2132();
		@Pc(68) int local68 = super.anInt4963 * 2 + 1;
		this.aShortArray89 = new short[local68];
		for (@Pc(74) int local74 = 0; local74 < this.aShortArray89.length; local74++) {
			@Pc(81) short local81 = (short) arg0.method2161();
			@Pc(85) int local85 = local81 >>> 8;
			if (local68 <= local85) {
				local85 = local68 - 1;
			}
			@Pc(100) int local100 = local81 & 0xFF;
			if (local68 - local85 < local100) {
				local100 = local68 - local85;
			}
			this.aShortArray89[local74] = (short) (local100 | local85 << 8);
		}
		super.anInt4963 = (super.anInt4963 << Static153.anInt3177) + Static145.anInt3090;
		if (Static209.anIntArray347 == null) {
			super.anInt4970 = Static170.anIntArray264[Static28.method693(arg0.method2161()) & 0xFFFF];
		} else {
			super.anInt4970 = Static209.anIntArray347[arg0.method2161()];
		}
		@Pc(162) int local162 = arg0.method2132();
		this.anInt4975 = local162 & 0x1F;
		this.anInt4985 = (local162 & 0xE0) << 3;
		if (this.anInt4975 != 31) {
			this.method4543();
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIB)V")
	public void method4539(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = this.anInt4985 + arg1 * this.anInt4982 / 50 & 0x7FF;
			@Pc(26) int local26 = this.anInt4973;
			if (local26 == 1) {
				local9 = (Class208.anIntArray479[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local9 = Static344.anIntArray383[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		super.aFloat52 = (float) ((this.anInt4974 * local9 >> 11) + this.anInt4984) / 2048.0F;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
	public void method4541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt4973 = arg0;
		this.anInt4982 = arg1;
		this.anInt4974 = arg3;
		this.anInt4984 = arg2;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V")
	private void method4543() {
		@Pc(8) int local8 = this.anInt4975;
		if (local8 == 2) {
			this.anInt4982 = 2048;
			this.anInt4984 = 0;
			this.anInt4973 = 1;
			this.anInt4974 = 2048;
		} else if (local8 == 3) {
			this.anInt4974 = 2048;
			this.anInt4973 = 1;
			this.anInt4984 = 0;
			this.anInt4982 = 4096;
		} else if (local8 == 4) {
			this.anInt4973 = 4;
			this.anInt4984 = 0;
			this.anInt4974 = 2048;
			this.anInt4982 = 2048;
		} else if (local8 == 5) {
			this.anInt4982 = 8192;
			this.anInt4973 = 4;
			this.anInt4974 = 2048;
			this.anInt4984 = 0;
		} else if (local8 == 12) {
			this.anInt4984 = 0;
			this.anInt4973 = 2;
			this.anInt4974 = 2048;
			this.anInt4982 = 2048;
		} else if (local8 == 13) {
			this.anInt4973 = 2;
			this.anInt4984 = 0;
			this.anInt4974 = 2048;
			this.anInt4982 = 8192;
		} else if (local8 == 10) {
			this.anInt4982 = 2048;
			this.anInt4984 = 1536;
			this.anInt4974 = 512;
			this.anInt4973 = 3;
		} else if (local8 == 11) {
			this.anInt4982 = 4096;
			this.anInt4974 = 512;
			this.anInt4973 = 3;
			this.anInt4984 = 1536;
		} else if (local8 == 6) {
			this.anInt4974 = 768;
			this.anInt4984 = 1280;
			this.anInt4973 = 3;
			this.anInt4982 = 2048;
		} else if (local8 == 7) {
			this.anInt4982 = 4096;
			this.anInt4974 = 768;
			this.anInt4973 = 3;
			this.anInt4984 = 1280;
		} else if (local8 == 8) {
			this.anInt4973 = 3;
			this.anInt4982 = 2048;
			this.anInt4984 = 1024;
			this.anInt4974 = 1024;
		} else if (local8 == 9) {
			this.anInt4982 = 4096;
			this.anInt4984 = 1024;
			this.anInt4974 = 1024;
			this.anInt4973 = 3;
		} else if (local8 == 14) {
			this.anInt4984 = 1280;
			this.anInt4973 = 1;
			this.anInt4982 = 2048;
			this.anInt4974 = 768;
		} else if (local8 == 15) {
			this.anInt4973 = 1;
			this.anInt4974 = 512;
			this.anInt4984 = 1536;
			this.anInt4982 = 4096;
		} else if (local8 == 16) {
			this.anInt4973 = 1;
			this.anInt4984 = 1792;
			this.anInt4974 = 256;
			this.anInt4982 = 8192;
		} else {
			this.anInt4973 = 0;
			this.anInt4984 = 0;
			this.anInt4982 = 2048;
			this.anInt4974 = 2048;
		}
	}
}
