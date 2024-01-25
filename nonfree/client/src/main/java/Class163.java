import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ho")
public final class Class163 {

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	public int anInt4513;

	@OriginalMember(owner = "client!ho", name = "k", descriptor = "Z")
	public boolean aBoolean350 = false;

	@OriginalMember(owner = "client!ho", name = "t", descriptor = "Lclient!ui;")
	private Class359 aClass359_27 = new Class359(64);

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "Lclient!ui;")
	public final Class359 aClass359_28 = new Class359(500);

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "Lclient!ui;")
	public final Class359 aClass359_29 = new Class359(30);

	@OriginalMember(owner = "client!ho", name = "g", descriptor = "Lclient!ui;")
	public final Class359 aClass359_30 = new Class359(50);

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "Lclient!fs;")
	private Class121 aClass121_3;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "Lclient!lga;")
	private final Class223 aClass223_48;

	@OriginalMember(owner = "client!ho", name = "f", descriptor = "Z")
	public boolean aBoolean349;

	@OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
	private final int anInt4510;

	@OriginalMember(owner = "client!ho", name = "v", descriptor = "Lclient!lga;")
	public final Class223 aClass223_49;

	@OriginalMember(owner = "client!ho", name = "n", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray18;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(Lclient!fs;IZLclient!lga;Lclient!lga;)V")
	public Class163(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class223 arg3, @OriginalArg(4) Class223 arg4) {
		this.aClass121_3 = arg0;
		this.aClass223_48 = arg3;
		this.aBoolean349 = arg2;
		this.anInt4510 = arg1;
		this.aClass223_49 = arg4;
		if (this.aClass223_48 != null) {
			@Pc(53) int local53 = this.aClass223_48.method5290() - 1;
			this.aClass223_48.method5264(local53);
		}
		if (this.aClass121_3 == Static517.aClass121_8) {
			this.aStringArray18 = new String[] { null, null, null, null, null, Static50.aClass43_22.method596(this.anInt4510) };
		} else {
			this.aStringArray18 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)V")
	public void method4117(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean350) {
			this.aBoolean350 = arg0;
			this.method4119();
		}
	}

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(I)V")
	public void method4118() {
		@Pc(2) Class359 local2 = this.aClass359_27;
		synchronized (this.aClass359_27) {
			this.aClass359_27.method8511();
		}
		local2 = this.aClass359_28;
		synchronized (this.aClass359_28) {
			this.aClass359_28.method8511();
		}
		local2 = this.aClass359_29;
		synchronized (this.aClass359_29) {
			this.aClass359_29.method8511();
		}
		local2 = this.aClass359_30;
		synchronized (this.aClass359_30) {
			this.aClass359_30.method8511();
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(I)V")
	public void method4119() {
		@Pc(6) Class359 local6 = this.aClass359_27;
		synchronized (this.aClass359_27) {
			this.aClass359_27.method8507();
		}
		local6 = this.aClass359_28;
		synchronized (this.aClass359_28) {
			this.aClass359_28.method8507();
		}
		local6 = this.aClass359_29;
		synchronized (this.aClass359_29) {
			this.aClass359_29.method8507();
		}
		local6 = this.aClass359_30;
		synchronized (this.aClass359_30) {
			this.aClass359_30.method8507();
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IB)V")
	public void method4120() {
		@Pc(2) Class359 local2 = this.aClass359_27;
		synchronized (this.aClass359_27) {
			this.aClass359_27.method8502(5);
		}
		local2 = this.aClass359_28;
		synchronized (this.aClass359_28) {
			this.aClass359_28.method8502(5);
		}
		local2 = this.aClass359_29;
		synchronized (this.aClass359_29) {
			this.aClass359_29.method8502(5);
		}
		local2 = this.aClass359_30;
		synchronized (this.aClass359_30) {
			this.aClass359_30.method8502(5);
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V")
	public void method4121(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean349) {
			this.aBoolean349 = arg0;
			this.method4119();
		}
	}

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(II)Lclient!fw;")
	public Class125 method4124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class359 local6 = this.aClass359_27;
		@Pc(16) Class125 local16;
		synchronized (this.aClass359_27) {
			local16 = (Class125) this.aClass359_27.method8517((long) arg1);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class223 local30 = this.aClass223_48;
		@Pc(43) byte[] local43;
		synchronized (this.aClass223_48) {
			local43 = this.aClass223_48.method5267(Static297.method8878(arg1), Static322.method5059(arg1));
			if (arg0 <= 118) {
				this.method4125((byte) 20, -64);
			}
		}
		local16 = new Class125();
		local16.anInt3629 = arg1;
		local16.aClass163_1 = this;
		local16.aStringArray13 = (String[]) this.aStringArray18.clone();
		if (local43 != null) {
			local16.method3390(new Class6_Sub15(local43));
		}
		local16.method3382();
		if (!this.aBoolean349 && local16.aBoolean295) {
			local16.aStringArray13 = null;
			local16.anIntArray194 = null;
		}
		if (local16.aBoolean297) {
			local16.aBoolean286 = false;
			local16.anInt3631 = 0;
		}
		@Pc(118) Class359 local118 = this.aClass359_27;
		synchronized (this.aClass359_27) {
			this.aClass359_27.method8515((long) arg1, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(BI)V")
	public void method4125(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.anInt4513 = arg1;
		@Pc(9) Class359 local9 = this.aClass359_28;
		synchronized (this.aClass359_28) {
			this.aClass359_28.method8507();
		}
		local9 = this.aClass359_29;
		synchronized (this.aClass359_29) {
			this.aClass359_29.method8507();
		}
		local9 = this.aClass359_30;
		synchronized (this.aClass359_30) {
			this.aClass359_30.method8507();
			if (arg0 != -6) {
				this.aClass121_3 = null;
			}
		}
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(II)V")
	public void method4126(@OriginalArg(1) int arg0) {
		this.aClass359_27 = new Class359(arg0);
	}
}
