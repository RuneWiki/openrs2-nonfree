import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class345 {

	@OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
	public int anInt9252;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!mga;")
	private final Class223 aClass223_65 = new Class223(64);

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "Lclient!mga;")
	public final Class223 aClass223_66 = new Class223(50);

	@OriginalMember(owner = "client!vd", name = "v", descriptor = "Lclient!mga;")
	public final Class223 aClass223_67 = new Class223(5);

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!bi;")
	public final Class31 aClass31_116;

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!pca;")
	public final Class263 aClass263_6;

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "Z")
	public boolean aBoolean639;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!bi;")
	private final Class31 aClass31_117;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!pca;IZLclient!bi;Lclient!bi;)V")
	public Class345(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) Class31 arg4) {
		this.aClass31_116 = arg4;
		this.aClass263_6 = arg0;
		this.aBoolean639 = arg2;
		this.aClass31_117 = arg3;
		if (this.aClass31_117 != null) {
			@Pc(41) int local41 = this.aClass31_117.method675() - 1;
			this.aClass31_117.method657(local41);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)Lclient!ci;")
	public Class54 method7602(@OriginalArg(0) int arg0) {
		@Pc(6) Class223 local6 = this.aClass223_65;
		@Pc(16) Class54 local16;
		synchronized (this.aClass223_65) {
			local16 = (Class54) this.aClass223_65.method4943((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class31 local29 = this.aClass31_117;
		@Pc(42) byte[] local42;
		synchronized (this.aClass31_117) {
			local42 = this.aClass31_117.method667(Static113.method2339(arg0), Static312.method8007(arg0));
		}
		local16 = new Class54();
		local16.aClass345_1 = this;
		local16.anInt1254 = arg0;
		if (local42 != null) {
			local16.method1110(new Class4_Sub9(local42));
		}
		local16.method1109();
		@Pc(79) Class223 local79 = this.aClass223_65;
		synchronized (this.aClass223_65) {
			this.aClass223_65.method4938((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public void method7604() {
		@Pc(2) Class223 local2 = this.aClass223_65;
		synchronized (this.aClass223_65) {
			this.aClass223_65.method4941();
		}
		local2 = this.aClass223_66;
		synchronized (this.aClass223_66) {
			this.aClass223_66.method4941();
		}
		local2 = this.aClass223_67;
		synchronized (this.aClass223_67) {
			this.aClass223_67.method4941();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI)V")
	public void method7605(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean639) {
			this.aBoolean639 = arg0;
			this.method7613();
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(ZI)V")
	public void method7607() {
		@Pc(6) Class223 local6 = this.aClass223_65;
		synchronized (this.aClass223_65) {
			this.aClass223_65.method4933(5);
		}
		local6 = this.aClass223_66;
		synchronized (this.aClass223_66) {
			this.aClass223_66.method4933(5);
		}
		local6 = this.aClass223_67;
		synchronized (this.aClass223_67) {
			this.aClass223_67.method4933(5);
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V")
	public void method7611(@OriginalArg(0) int arg0) {
		this.anInt9252 = arg0;
		@Pc(13) Class223 local13 = this.aClass223_66;
		synchronized (this.aClass223_66) {
			this.aClass223_66.method4932();
		}
		local13 = this.aClass223_67;
		synchronized (this.aClass223_67) {
			this.aClass223_67.method4932();
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public void method7612() {
		@Pc(6) Class223 local6 = this.aClass223_66;
		synchronized (this.aClass223_66) {
			this.aClass223_66.method4932();
		}
		local6 = this.aClass223_67;
		synchronized (this.aClass223_67) {
			this.aClass223_67.method4932();
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V")
	public void method7613() {
		@Pc(2) Class223 local2 = this.aClass223_65;
		synchronized (this.aClass223_65) {
			this.aClass223_65.method4932();
		}
		local2 = this.aClass223_66;
		synchronized (this.aClass223_66) {
			this.aClass223_66.method4932();
		}
		local2 = this.aClass223_67;
		synchronized (this.aClass223_67) {
			this.aClass223_67.method4932();
		}
	}
}
