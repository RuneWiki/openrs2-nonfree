import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cba")
public final class Class53 {

	@OriginalMember(owner = "client!cba", name = "w", descriptor = "I")
	public int anInt1626;

	@OriginalMember(owner = "client!cba", name = "q", descriptor = "Z")
	public boolean aBoolean118 = false;

	@OriginalMember(owner = "client!cba", name = "u", descriptor = "Lclient!qfa;")
	private Class307 aClass307_14 = new Class307(64);

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "Lclient!qfa;")
	public final Class307 aClass307_15 = new Class307(500);

	@OriginalMember(owner = "client!cba", name = "o", descriptor = "Lclient!qfa;")
	public final Class307 aClass307_16 = new Class307(30);

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "Lclient!qfa;")
	public final Class307 aClass307_17 = new Class307(50);

	@OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
	private final int anInt1624;

	@OriginalMember(owner = "client!cba", name = "z", descriptor = "Lclient!qh;")
	private final Class309 aClass309_2;

	@OriginalMember(owner = "client!cba", name = "n", descriptor = "Lclient!ik;")
	private final Class182 aClass182_16;

	@OriginalMember(owner = "client!cba", name = "g", descriptor = "Z")
	public boolean aBoolean117;

	@OriginalMember(owner = "client!cba", name = "y", descriptor = "Lclient!ik;")
	public final Class182 aClass182_15;

	@OriginalMember(owner = "client!cba", name = "h", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray4;

	static {
		new BitSet(65536);
	}

	@OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Lclient!qh;IZLclient!ik;Lclient!ik;)V")
	public Class53(@OriginalArg(0) Class309 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class182 arg3, @OriginalArg(4) Class182 arg4) {
		this.anInt1624 = arg1;
		this.aClass309_2 = arg0;
		this.aClass182_16 = arg3;
		this.aBoolean117 = arg2;
		this.aClass182_15 = arg4;
		if (this.aClass182_16 != null) {
			@Pc(53) int local53 = this.aClass182_16.method3956() - 1;
			this.aClass182_16.method3970(local53);
		}
		if (this.aClass309_2 == Static326.aClass309_5) {
			this.aStringArray4 = new String[] { null, null, null, null, null, Static430.aClass257_22.method5699(this.anInt1624) };
		} else {
			this.aStringArray4 = new String[] { null, null, null, null, null, null };
		}
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(I)V")
	public void method1520() {
		@Pc(2) Class307 local2 = this.aClass307_14;
		synchronized (this.aClass307_14) {
			this.aClass307_14.method7006();
		}
		local2 = this.aClass307_15;
		synchronized (this.aClass307_15) {
			this.aClass307_15.method7006();
		}
		local2 = this.aClass307_16;
		synchronized (this.aClass307_16) {
			this.aClass307_16.method7006();
		}
		local2 = this.aClass307_17;
		synchronized (this.aClass307_17) {
			this.aClass307_17.method7006();
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZI)V")
	public void method1521(@OriginalArg(0) boolean arg0) {
		if (arg0 != this.aBoolean118) {
			this.aBoolean118 = arg0;
			this.method1520();
		}
	}

	@OriginalMember(owner = "client!cba", name = "c", descriptor = "(II)V")
	public void method1522() {
		@Pc(2) Class307 local2 = this.aClass307_14;
		synchronized (this.aClass307_14) {
			this.aClass307_14.method6995(5);
		}
		local2 = this.aClass307_15;
		synchronized (this.aClass307_15) {
			this.aClass307_15.method6995(5);
		}
		local2 = this.aClass307_16;
		synchronized (this.aClass307_16) {
			this.aClass307_16.method6995(5);
		}
		local2 = this.aClass307_17;
		synchronized (this.aClass307_17) {
			this.aClass307_17.method6995(5);
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(II)Lclient!mf;")
	public Class247 method1523(@OriginalArg(0) int arg0) {
		@Pc(6) Class307 local6 = this.aClass307_14;
		@Pc(16) Class247 local16;
		synchronized (this.aClass307_14) {
			local16 = (Class247) this.aClass307_14.method7002((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class182 local30 = this.aClass182_16;
		@Pc(43) byte[] local43;
		synchronized (this.aClass182_16) {
			local43 = this.aClass182_16.method3985(Static489.method9237(arg0), Static507.method6896(arg0));
		}
		local16 = new Class247();
		local16.aClass53_4 = this;
		local16.anInt6249 = arg0;
		local16.aStringArray25 = (String[]) this.aStringArray4.clone();
		if (local43 != null) {
			local16.method5444(new Class3_Sub2(local43));
		}
		local16.method5439();
		if (local16.aBoolean415) {
			local16.aBoolean416 = false;
			local16.anInt6289 = 0;
		}
		if (!this.aBoolean117 && local16.aBoolean420) {
			local16.anIntArray480 = null;
			local16.aStringArray25 = null;
		}
		@Pc(117) Class307 local117 = this.aClass307_14;
		synchronized (this.aClass307_14) {
			this.aClass307_14.method7000(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V")
	public void method1524() {
		@Pc(6) Class307 local6 = this.aClass307_14;
		synchronized (this.aClass307_14) {
			this.aClass307_14.method6998();
		}
		local6 = this.aClass307_15;
		synchronized (this.aClass307_15) {
			this.aClass307_15.method6998();
		}
		local6 = this.aClass307_16;
		synchronized (this.aClass307_16) {
			this.aClass307_16.method6998();
		}
		local6 = this.aClass307_17;
		synchronized (this.aClass307_17) {
			this.aClass307_17.method6998();
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(II)V")
	public void method1526(@OriginalArg(0) int arg0) {
		this.aClass307_14 = new Class307(arg0);
	}

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(ZZ)V")
	public void method1527(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean117) {
			this.aBoolean117 = arg0;
			this.method1520();
		}
	}

	@OriginalMember(owner = "client!cba", name = "b", descriptor = "(ZI)V")
	public void method1529(@OriginalArg(1) int arg0) {
		this.anInt1626 = arg0;
		@Pc(9) Class307 local9 = this.aClass307_15;
		synchronized (this.aClass307_15) {
			this.aClass307_15.method7006();
		}
		local9 = this.aClass307_16;
		synchronized (this.aClass307_16) {
			this.aClass307_16.method7006();
		}
		local9 = this.aClass307_17;
		synchronized (this.aClass307_17) {
			this.aClass307_17.method7006();
		}
	}
}
