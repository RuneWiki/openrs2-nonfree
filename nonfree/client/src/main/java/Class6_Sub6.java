import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sl")
public final class Class6_Sub6 extends Class6 {

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "Z")
	private boolean aBoolean665;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "Z")
	private boolean aBoolean666;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "Z")
	private boolean aBoolean664 = false;

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "Z")
	private final boolean aBoolean667;

	@OriginalMember(owner = "client!sl", name = "x", descriptor = "Lclient!am;")
	private Class16 aClass16_3;

	@OriginalMember(owner = "client!sl", name = "o", descriptor = "Lclient!am;")
	private Class16 aClass16_2;

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "Lclient!am;")
	private Class16 aClass16_5;

	@OriginalMember(owner = "client!sl", name = "y", descriptor = "Lclient!am;")
	private Class16 aClass16_4;

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "Lclient!fba;")
	private Class94_Sub2 aClass94_Sub2_3;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class6_Sub6(@OriginalArg(0) Class82_Sub1 arg0) {
		super(arg0);
		if (super.aClass82_Sub1_41.aBoolean189) {
			this.aClass16_3 = Static411.method6903("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, fogFactor;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass82_Sub1_41);
			this.aClass16_2 = Static411.method6903("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   tMatrix[4]   = { state.matrix.texture[0] };\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nTEMP    viewPos, viewNormal, fogFactor, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nMAD   fogFactor.y, iTexCoord.z, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMUL   fogFactor.x, fogFactor.x, fogFactor.y;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, iTexCoord.z;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP3   oTexCoord0.x, tMatrix[0], iTexCoord;\nDP3   oTexCoord0.y, tMatrix[1], iTexCoord;\nMOV   oTexCoord0.zw, iTexCoord;\nEND\n", super.aClass82_Sub1_41);
			this.aClass16_5 = Static411.method6903("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, fogFactor, depth;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nMOV   oColour, iColour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass82_Sub1_41);
			this.aClass16_4 = Static411.method6903("!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iNormal      = vertex.normal;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   fogParams    = program.local[0];\nPARAM   waterPlane   = program.local[1];\nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   texMatrix[4] = { state.matrix.texture[0] };\nTEMP    viewPos, viewNormal, fogFactor, depth, colour, ndotl;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nSUB   fogFactor.x, -viewPos.z, fogParams.x;\nMUL   fogFactor.x, fogFactor.x, 0.001953125;\nDP4   depth, waterPlane, viewPos;\nMAD   fogFactor.y, -depth, fogParams.z, fogParams.w;\nSUB   fogFactor.z, -viewPos.z, fogParams.y;\nMUL   fogFactor.z, fogFactor.z, 0.00390625;\nMIN   fogFactor, fogFactor, 1;\nMAX   fogFactor, fogFactor, 0;\nMUL   fogFactor.z, fogFactor.z, -depth;\nMAD   viewPos.xyz, waterPlane.xyzw, fogFactor.zzzz, viewPos.xyzw;\nMAX   oTexCoord1.xyz, fogFactor.xxxx, fogFactor.yyyy;\nMOV   oTexCoord1.w, 1;\nDP3   viewNormal.x, mvMatrix[0], iNormal;\nDP3   viewNormal.y, mvMatrix[1], iNormal;\nDP3   viewNormal.z, mvMatrix[2], iNormal;\nDP3   ndotl.x, viewNormal, state.light[0].position;\nDP3   ndotl.y, viewNormal, state.light[1].position;\nMAX   ndotl, ndotl, 0;\nMOV   colour, state.lightmodel.ambient;\nMAD   colour, state.light[0].diffuse, ndotl.xxxx, colour;\nMAD   colour, state.light[1].diffuse, ndotl.yyyy, colour;\nMUL   oColour, iColour, colour;\nDP4   oPos.x, pMatrix[0], viewPos;\nDP4   oPos.y, pMatrix[1], viewPos;\nDP4   oPos.z, pMatrix[2], viewPos;\nDP4   oPos.w, pMatrix[3], viewPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   oTexCoord0.x, texMatrix[0], iTexCoord;\nDP4   oTexCoord0.y, texMatrix[1], iTexCoord;\nDP4   oTexCoord0.z, texMatrix[2], iTexCoord;\nMOV   oTexCoord0.w, 1;\nEND\n", super.aClass82_Sub1_41);
			if (this.aClass16_4 != null & this.aClass16_3 != null & this.aClass16_2 != null & this.aClass16_5 != null) {
				this.aClass94_Sub2_3 = new Class94_Sub2(arg0, 3553, 6406, 2, 1, false, new byte[] { 0, -1 }, 6406, false);
				this.aClass94_Sub2_3.method3120(false, false);
				this.aBoolean667 = true;
			} else {
				this.aBoolean667 = false;
			}
		} else {
			this.aBoolean667 = false;
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
	@Override
	public void method8031() {
		if (this.aBoolean666) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean666 = false;
		}
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2029((Class94) null);
		super.aClass82_Sub1_41.method2077(8448, 8448);
		super.aClass82_Sub1_41.method2066(5890, 768, 0);
		super.aClass82_Sub1_41.method2066(34166, 770, 2);
		super.aClass82_Sub1_41.method2063(5890, 0);
		super.aClass82_Sub1_41.method2086(0);
		if (this.aBoolean664) {
			super.aClass82_Sub1_41.method2066(5890, 768, 0);
			super.aClass82_Sub1_41.method2063(5890, 0);
			this.aBoolean664 = false;
		}
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method8025() {
		return this.aBoolean667;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8026(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lclient!wu;II)V")
	@Override
	public void method8029(@OriginalArg(0) Class94 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean664) {
				super.aClass82_Sub1_41.method2066(5890, 768, 0);
				super.aClass82_Sub1_41.method2063(5890, 0);
				this.aBoolean664 = false;
			}
			super.aClass82_Sub1_41.method2029(arg0);
			super.aClass82_Sub1_41.method2068(arg1);
		} else if (!this.aBoolean664) {
			super.aClass82_Sub1_41.method2029(super.aClass82_Sub1_41.aClass94_Sub2_1);
			super.aClass82_Sub1_41.method2068(1);
			super.aClass82_Sub1_41.method2066(34168, 768, 0);
			super.aClass82_Sub1_41.method2063(34168, 0);
			this.aBoolean664 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V")
	public void method7606() {
		if (!this.aBoolean666) {
			return;
		}
		@Pc(10) int local10 = super.aClass82_Sub1_41.XA();
		@Pc(14) int local14 = super.aClass82_Sub1_41.i();
		@Pc(24) float local24 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(34) float local34 = (float) local10 - (float) (local10 - local14) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local34, local24, 1.0F / (float) super.aClass82_Sub1_41.anInt2487, (float) super.aClass82_Sub1_41.anInt2476 / 255.0F);
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2100(super.aClass82_Sub1_41.anInt2480);
		super.aClass82_Sub1_41.method2086(0);
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(Z)V")
	public void method7607() {
		@Pc(7) Class31_Sub3 local7 = super.aClass82_Sub1_41.aClass31_Sub3_4;
		if (this.aBoolean665) {
			OpenGL.glBindProgramARB(34336, ~super.aClass82_Sub1_41.anInt2500 == Integer.MIN_VALUE ? this.aClass16_2.anInt254 : this.aClass16_4.anInt254);
		} else {
			OpenGL.glBindProgramARB(34336, super.aClass82_Sub1_41.anInt2500 == Integer.MAX_VALUE ? this.aClass16_3.anInt254 : this.aClass16_5.anInt254);
		}
		local7.method7941(0.0F, 0.0F, (float) super.aClass82_Sub1_41.anInt2500, -1.0F, Static250.aFloatArray80);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, Static250.aFloatArray80[0], Static250.aFloatArray80[1], Static250.aFloatArray80[2], Static250.aFloatArray80[3]);
		OpenGL.glEnable(34336);
		this.aBoolean666 = true;
		this.method7606();
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8028(@OriginalArg(0) boolean arg0) {
		this.aBoolean665 = arg0;
		super.aClass82_Sub1_41.method2086(1);
		super.aClass82_Sub1_41.method2029(this.aClass94_Sub2_3);
		super.aClass82_Sub1_41.method2077(34165, 7681);
		super.aClass82_Sub1_41.method2066(34166, 768, 0);
		super.aClass82_Sub1_41.method2066(5890, 770, 2);
		super.aClass82_Sub1_41.method2063(34168, 0);
		super.aClass82_Sub1_41.method2086(0);
		this.method7607();
	}
}
