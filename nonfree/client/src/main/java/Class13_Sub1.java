import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
	private int anInt501;

	@OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
	private int anInt502;

	@OriginalMember(owner = "client!cb", name = "ib", descriptor = "[Z")
	private volatile boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!cb", name = "Z", descriptor = "Z")
	private volatile boolean aBoolean34 = false;

	@OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
	private int anInt508 = -1;

	@OriginalMember(owner = "client!cb", name = "db", descriptor = "Z")
	private boolean aBoolean35 = false;

	@OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
	private final int anInt505;

	@OriginalMember(owner = "client!cb", name = "fb", descriptor = "Lclient!je;")
	private final Class43 aClass43_1;

	@OriginalMember(owner = "client!cb", name = "nb", descriptor = "Lclient!je;")
	private final Class43 aClass43_2;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!je;Lclient!je;IZZZ)V")
	public Class13_Sub1(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Class43 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		super(arg3, arg4);
		this.anInt505 = arg2;
		this.aBoolean35 = arg5;
		this.aClass43_1 = arg1;
		this.aClass43_2 = arg0;
		Static54.method967(this, this.anInt505);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)V")
	@Override
	protected void method357(@OriginalArg(1) int arg0) {
		if (this.aClass43_2 == null || this.aBooleanArray1 == null || !this.aBooleanArray1[arg0]) {
			Static126.method2143(this.anInt505, true, super.anIntArray44[arg0], (byte) 2, this, arg0);
		} else {
			Static6.method106(arg0, this, this.aClass43_2);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZZ[BIZ)V")
	public void method369(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		if (arg1) {
			if (this.aBoolean34) {
				throw new RuntimeException();
			}
			if (this.aClass43_1 != null) {
				Static41.method778(this.aClass43_1, arg2, this.anInt505);
			}
			this.method355(arg2);
			this.method370();
			return;
		}
		arg2[arg2.length - 2] = (byte) (super.anIntArray43[arg3] >> 8);
		arg2[arg2.length - 1] = (byte) super.anIntArray43[arg3];
		if (this.aClass43_2 != null) {
			Static41.method778(this.aClass43_2, arg2, arg3);
			this.aBooleanArray1[arg3] = true;
		}
		if (arg0) {
			super.anObjectArray2[arg3] = Static61.method1112(arg2);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
	@Override
	protected void method362(@OriginalArg(0) int arg0) {
		Static116.method2046(this.anInt505, arg0);
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
	private void method370() {
		this.aBooleanArray1 = new boolean[super.anObjectArray2.length];
		for (@Pc(13) int local13 = 0; local13 < this.aBooleanArray1.length; local13++) {
			this.aBooleanArray1[local13] = false;
		}
		if (this.aClass43_2 == null) {
			this.aBoolean34 = true;
			return;
		}
		this.anInt508 = -1;
		for (@Pc(38) int local38 = 0; local38 < this.aBooleanArray1.length; local38++) {
			if (super.anIntArray41[local38] > 0) {
				Static80.method1407(local38, this, this.aClass43_2);
				this.anInt508 = local38;
			}
		}
		if (this.anInt508 == -1) {
			this.aBoolean34 = true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(BI)I")
	private int method371(@OriginalArg(1) int arg0) {
		if (super.anObjectArray2[arg0] == null) {
			return this.aBooleanArray1[arg0] ? 100 : Static170.method2649(arg0, this.anInt505);
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZLclient!je;[BI)V")
	public void method373(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		@Pc(45) int local45;
		if (arg1 != this.aClass43_1) {
			if (!arg0 && arg3 == this.anInt508) {
				this.aBoolean34 = true;
			}
			if (arg2 == null || arg2.length <= 2) {
				this.aBooleanArray1[arg3] = false;
				if (this.aBoolean35 || arg0) {
					Static126.method2143(this.anInt505, arg0, super.anIntArray44[arg3], (byte) 2, this, arg3);
				}
			} else {
				Static139.aCRC32_2.reset();
				Static139.aCRC32_2.update(arg2, 0, arg2.length - 2);
				local45 = (int) Static139.aCRC32_2.getValue();
				@Pc(183) int local183 = (arg2[arg2.length - 1] & 0xFF) + ((arg2[arg2.length - 2] & 0xFF) << 8);
				if (super.anIntArray44[arg3] == local45 && local183 == super.anIntArray43[arg3]) {
					this.aBooleanArray1[arg3] = true;
					if (arg0) {
						super.anObjectArray2[arg3] = Static61.method1112(arg2);
					}
				} else {
					this.aBooleanArray1[arg3] = false;
					if (this.aBoolean35 || arg0) {
						Static126.method2143(this.anInt505, arg0, super.anIntArray44[arg3], (byte) 2, this, arg3);
					}
				}
			}
		} else if (this.aBoolean34) {
			throw new RuntimeException();
		} else if (arg2 == null) {
			Static126.method2143(255, true, this.anInt502, (byte) 0, this, this.anInt505);
		} else {
			Static139.aCRC32_2.reset();
			Static139.aCRC32_2.update(arg2, 0, arg2.length);
			local45 = (int) Static139.aCRC32_2.getValue();
			@Pc(52) Class3_Sub12 local52 = new Class3_Sub12(Static26.method549(arg2));
			@Pc(56) int local56 = local52.method1354();
			if (local56 != 5 && local56 != 6) {
				throw new RuntimeException("Incorrect JS5 protocol number: " + local56);
			}
			@Pc(75) int local75 = 0;
			if (local56 >= 6) {
				local75 = local52.method1373();
			}
			if (local45 == this.anInt502 && this.anInt501 == local75) {
				this.method355(arg2);
				this.method370();
			} else {
				Static126.method2143(255, true, this.anInt502, (byte) 0, this, this.anInt505);
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)I")
	public int method374() {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < super.anObjectArray2.length; local11++) {
			if (super.anIntArray41[local11] > 0) {
				local9 += this.method371(local11);
				local7 += 100;
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(III)V")
	public void method376(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt502 = arg1;
		this.anInt501 = arg0;
		if (this.aClass43_1 == null) {
			Static126.method2143(255, true, this.anInt502, (byte) 0, this, this.anInt505);
		} else {
			Static6.method106(this.anInt505, this, this.aClass43_1);
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)I")
	public int method378() {
		if (this.aBoolean34) {
			return 100;
		} else if (super.anObjectArray2 == null) {
			@Pc(19) int local19 = Static170.method2649(this.anInt505, 255);
			if (local19 >= 100) {
				local19 = 99;
			}
			return local19;
		} else {
			return 99;
		}
	}
}
