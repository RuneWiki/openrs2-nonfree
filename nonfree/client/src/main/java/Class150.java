import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class150 {

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public int anInt4371;

	@OriginalMember(owner = "client!lm", name = "g", descriptor = "Z")
	public boolean aBoolean365 = false;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "Lclient!jp;")
	private Class129 aClass129_38 = new Class129(64);

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Lclient!jp;")
	public final Class129 aClass129_39 = new Class129(500);

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "Lclient!jp;")
	public final Class129 aClass129_40 = new Class129(30);

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "Lclient!jp;")
	public final Class129 aClass129_41 = new Class129(50);

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "Lclient!pc;")
	public final Class188 aClass188_63;

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "Lclient!pc;")
	private final Class188 aClass188_62;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "Z")
	public boolean aBoolean364;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lclient!rb;IZLclient!pc;Lclient!pc;)V")
	public Class150(@OriginalArg(0) Class209 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class188 arg3, @OriginalArg(4) Class188 arg4) {
		this.aClass188_63 = arg4;
		this.aClass188_62 = arg3;
		this.aBoolean364 = arg2;
		if (this.aClass188_62 != null) {
			@Pc(47) int local47 = this.aClass188_62.method4299() - 1;
			this.aClass188_62.method4285(local47);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)Lclient!us;")
	public Class250 method3508(@OriginalArg(1) int arg0) {
		@Pc(6) Class129 local6 = this.aClass129_38;
		@Pc(18) Class250 local18;
		synchronized (this.aClass129_38) {
			local18 = (Class250) this.aClass129_38.method3023((long) arg0);
		}
		if (local18 != null) {
			return local18;
		}
		@Pc(41) byte[] local41 = this.aClass188_62.method4283(Static356.method4997(arg0), Static92.method1557(arg0));
		local18 = new Class250();
		local18.anInt7160 = arg0;
		local18.aClass150_4 = this;
		if (local41 != null) {
			local18.method5583(new Class2_Sub20(local41));
		}
		local18.method5587();
		if (!this.aBoolean364 && local18.aBoolean606) {
			local18.aStringArray41 = null;
			local18.anIntArray480 = null;
		}
		if (local18.aBoolean611) {
			local18.anInt7187 = 0;
			local18.aBoolean618 = false;
		}
		@Pc(87) Class129 local87 = this.aClass129_38;
		synchronized (this.aClass129_38) {
			this.aClass129_38.method3029(local18, (long) arg0);
			return local18;
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(II)V")
	public void method3509(@OriginalArg(1) int arg0) {
		this.aClass129_38 = new Class129(arg0);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V")
	public void method3510(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean365 != arg0) {
			this.aBoolean365 = arg0;
			this.method3514();
		}
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)V")
	public void method3511(@OriginalArg(1) int arg0) {
		this.anInt4371 = arg0;
		@Pc(9) Class129 local9 = this.aClass129_39;
		synchronized (this.aClass129_39) {
			this.aClass129_39.method3025();
		}
		local9 = this.aClass129_40;
		synchronized (this.aClass129_40) {
			this.aClass129_40.method3025();
		}
		local9 = this.aClass129_41;
		synchronized (this.aClass129_41) {
			this.aClass129_41.method3025();
		}
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	public void method3513() {
		@Pc(6) Class129 local6 = this.aClass129_38;
		synchronized (this.aClass129_38) {
			this.aClass129_38.method3026();
		}
		local6 = this.aClass129_39;
		synchronized (this.aClass129_39) {
			this.aClass129_39.method3026();
		}
		local6 = this.aClass129_40;
		synchronized (this.aClass129_40) {
			this.aClass129_40.method3026();
		}
		local6 = this.aClass129_41;
		synchronized (this.aClass129_41) {
			this.aClass129_41.method3026();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V")
	public void method3514() {
		@Pc(2) Class129 local2 = this.aClass129_38;
		synchronized (this.aClass129_38) {
			this.aClass129_38.method3025();
		}
		local2 = this.aClass129_39;
		synchronized (this.aClass129_39) {
			this.aClass129_39.method3025();
		}
		local2 = this.aClass129_40;
		synchronized (this.aClass129_40) {
			this.aClass129_40.method3025();
		}
		local2 = this.aClass129_41;
		synchronized (this.aClass129_41) {
			this.aClass129_41.method3025();
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BI)V")
	public void method3515() {
		@Pc(2) Class129 local2 = this.aClass129_38;
		synchronized (this.aClass129_38) {
			this.aClass129_38.method3028(5);
		}
		local2 = this.aClass129_39;
		synchronized (this.aClass129_39) {
			this.aClass129_39.method3028(5);
		}
		local2 = this.aClass129_40;
		synchronized (this.aClass129_40) {
			this.aClass129_40.method3028(5);
		}
		local2 = this.aClass129_41;
		synchronized (this.aClass129_41) {
			this.aClass129_41.method3028(5);
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZB)V")
	public void method3518(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean364 != arg0) {
			this.aBoolean364 = arg0;
			this.method3514();
		}
	}
}
